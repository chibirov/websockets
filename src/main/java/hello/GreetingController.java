package hello;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Controller
public class GreetingController {
	
    private static final double INITIAL_PORTFOLIO = 100000.00;

	@Autowired
    private RestTemplate template;
    
    private @Autowired HttpServletRequest request;
    
    private Map<String,  Map<String, Integer>> usersToStocks = new HashMap<String,  Map<String, Integer>>();
    
    private Map<String,  Map<String, Double>> usersToPrice = new HashMap<String,  Map<String, Double>>();
    
    private Map<String,  Double> usersToPortfolio = new HashMap<String, Double>();
    
    @RequestMapping(method=RequestMethod.GET, path="/init")
    public @ResponseBody Map<String, Object> initUser() throws Exception {
    	initNewUser();
    	return buildMap();
    }

    @RequestMapping(method=RequestMethod.POST, path="/sell")
    public @ResponseBody Map<String, Object> sell(@RequestBody Map<String, ?> stocks) throws Exception {
    	return update(stocks, false);
    }
    
    @RequestMapping(method=RequestMethod.POST, path="/buy")
    public @ResponseBody Map<String, Object> buy(@RequestBody Map<String, ?> stocks) throws Exception {
    	return update(stocks, true);    	
    }
    
    @MessageMapping("/lookup")
    @SendTo("/topic/stocks")
    public Map greeting(String message) throws Exception {
    	Map<String, Map<String, ?>> stock = template.getForObject("http://data.benzinga.com/rest/richquoteDelayed?symbols={message}", Map.class, message);
        return stock.get(message);
    }
    
    private void initNewUser() {
    	String sessionId = request.getSession().getId();
		if(!usersToPortfolio.containsKey(sessionId)) {
    		usersToPortfolio.put(sessionId, INITIAL_PORTFOLIO);
    		usersToStocks.put(sessionId, new HashMap<String, Integer>());
    		usersToPrice.put(sessionId, new HashMap<String, Double>());
    	}
    }
    
    private Map<String, Object> buildMap() {
    	String sessionId = request.getSession().getId();
    	return new HashMap<String, Object>() {{
    		put("portfolio", usersToPortfolio.get(sessionId));
    		put("stocks", usersToStocks.get(sessionId));
    		put("prices", usersToPrice.get(sessionId));
    	}};
    }
    
    private Map<String, Object> update(Map<String, ?> stocks, boolean buy) throws Exception {
    	String sessionId = request.getSession().getId();
    	initNewUser();
    	Double portfolio = usersToPortfolio.get(sessionId);
    	Integer quantity = Integer.parseInt((String)stocks.get("quantity"));
    	String stockSymbol = ((String)stocks.get("company")).replace("(", "").replace(")", "");
    	Double stockPrice = Double.parseDouble(stocks.get("price").toString());
    	Map<String, Integer> currentStocks = usersToStocks.get(sessionId);
    	Map<String, Double> currentPrices = usersToPrice.get(sessionId);
    	Integer newQuantity = quantity;
    	Integer currentQuantity = currentStocks.get(stockSymbol);
    	Double currentPricePaid = currentPrices.get(stockSymbol); 
    	double totalSum = quantity * stockPrice;
    	Double newPrice = totalSum;
		if (currentStocks != null && currentStocks.containsKey(stockSymbol)) {
    		newQuantity = buy ? quantity + currentQuantity : currentQuantity - quantity;
			newPrice = buy ? totalSum + currentPricePaid : currentPricePaid - totalSum;
		} else if (!buy)
    		newQuantity = -1;
    	if (newQuantity < 0 || newPrice < 0) throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
		if ( (buy && totalSum < portfolio) || !buy) {
			if (newQuantity == 0) {
				currentStocks.remove(stockSymbol);
				currentPrices.remove(stockSymbol);
			} else {
	    		currentStocks.put(stockSymbol, newQuantity);
	    		currentPrices.put(stockSymbol, newPrice);
			}
    		usersToPrice.put(sessionId, currentPrices);
    		usersToStocks.put(sessionId, currentStocks);
    		usersToPortfolio.put(sessionId, buy ? portfolio - totalSum : portfolio + totalSum);
    	} else throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
    	return buildMap();
    }
}