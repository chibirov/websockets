package hello;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "symbol", "dxSymbol", "exchange", "isoExchange",
		"bzExchange", "type", "name", "description", "sector", "industry",
		"open", "high", "low", "close", "bidPrice", "askPrice", "askSize",
		"bidSize", "size", "bidTime", "askTime", "lastTradePrice",
		"lastTradeTime", "volume", "change", "changePercent",
		"previousClosePrice", "fiftyDayAveragePrice", "fiftyTwoWeekHigh",
		"fiftyTwoWeekLow", "marketCap", "sharesOutstanding", "pe", "forwardPE",
		"dividendYield", "payoutRatio", "ethPrice", "ethVolume", "ethTime" })
public class Stock {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("dxSymbol")
	private String dxSymbol;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("isoExchange")
	private String isoExchange;
	@JsonProperty("bzExchange")
	private String bzExchange;
	@JsonProperty("type")
	private String type;
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("sector")
	private String sector;
	@JsonProperty("industry")
	private String industry;
	@JsonProperty("open")
	private Double open;
	@JsonProperty("high")
	private Double high;
	@JsonProperty("low")
	private Double low;
	@JsonProperty("close")
	private Double close;
	@JsonProperty("bidPrice")
	private Double bidPrice;
	@JsonProperty("askPrice")
	private Double askPrice;
	@JsonProperty("askSize")
	private Integer askSize;
	@JsonProperty("bidSize")
	private Integer bidSize;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("bidTime")
	private Integer bidTime;
	@JsonProperty("askTime")
	private Integer askTime;
	@JsonProperty("lastTradePrice")
	private Double lastTradePrice;
	@JsonProperty("lastTradeTime")
	private Integer lastTradeTime;
	@JsonProperty("volume")
	private Integer volume;
	@JsonProperty("change")
	private Double change;
	@JsonProperty("changePercent")
	private Double changePercent;
	@JsonProperty("previousClosePrice")
	private Double previousClosePrice;
	@JsonProperty("fiftyDayAveragePrice")
	private Double fiftyDayAveragePrice;
	@JsonProperty("fiftyTwoWeekHigh")
	private Double fiftyTwoWeekHigh;
	@JsonProperty("fiftyTwoWeekLow")
	private Double fiftyTwoWeekLow;
	@JsonProperty("marketCap")
	private Integer marketCap;
	@JsonProperty("sharesOutstanding")
	private Integer sharesOutstanding;
	@JsonProperty("pe")
	private Double pe;
	@JsonProperty("forwardPE")
	private Double forwardPE;
	@JsonProperty("dividendYield")
	private Double dividendYield;
	@JsonProperty("payoutRatio")
	private Double payoutRatio;
	@JsonProperty("ethPrice")
	private Double ethPrice;
	@JsonProperty("ethVolume")
	private Integer ethVolume;
	@JsonProperty("ethTime")
	private Integer ethTime;

	/**
	 * 
	 * @return The symbol
	 */
	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	/**
	 * 
	 * @param symbol
	 *            The symbol
	 */
	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * 
	 * @return The dxSymbol
	 */
	@JsonProperty("dxSymbol")
	public String getDxSymbol() {
		return dxSymbol;
	}

	/**
	 * 
	 * @param dxSymbol
	 *            The dxSymbol
	 */
	@JsonProperty("dxSymbol")
	public void setDxSymbol(String dxSymbol) {
		this.dxSymbol = dxSymbol;
	}

	/**
	 * 
	 * @return The exchange
	 */
	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	/**
	 * 
	 * @param exchange
	 *            The exchange
	 */
	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * 
	 * @return The isoExchange
	 */
	@JsonProperty("isoExchange")
	public String getIsoExchange() {
		return isoExchange;
	}

	/**
	 * 
	 * @param isoExchange
	 *            The isoExchange
	 */
	@JsonProperty("isoExchange")
	public void setIsoExchange(String isoExchange) {
		this.isoExchange = isoExchange;
	}

	/**
	 * 
	 * @return The bzExchange
	 */
	@JsonProperty("bzExchange")
	public String getBzExchange() {
		return bzExchange;
	}

	/**
	 * 
	 * @param bzExchange
	 *            The bzExchange
	 */
	@JsonProperty("bzExchange")
	public void setBzExchange(String bzExchange) {
		this.bzExchange = bzExchange;
	}

	/**
	 * 
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return The sector
	 */
	@JsonProperty("sector")
	public String getSector() {
		return sector;
	}

	/**
	 * 
	 * @param sector
	 *            The sector
	 */
	@JsonProperty("sector")
	public void setSector(String sector) {
		this.sector = sector;
	}

	/**
	 * 
	 * @return The industry
	 */
	@JsonProperty("industry")
	public String getIndustry() {
		return industry;
	}

	/**
	 * 
	 * @param industry
	 *            The industry
	 */
	@JsonProperty("industry")
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * 
	 * @return The open
	 */
	@JsonProperty("open")
	public Double getOpen() {
		return open;
	}

	/**
	 * 
	 * @param open
	 *            The open
	 */
	@JsonProperty("open")
	public void setOpen(Double open) {
		this.open = open;
	}

	/**
	 * 
	 * @return The high
	 */
	@JsonProperty("high")
	public Double getHigh() {
		return high;
	}

	/**
	 * 
	 * @param high
	 *            The high
	 */
	@JsonProperty("high")
	public void setHigh(Double high) {
		this.high = high;
	}

	/**
	 * 
	 * @return The low
	 */
	@JsonProperty("low")
	public Double getLow() {
		return low;
	}

	/**
	 * 
	 * @param low
	 *            The low
	 */
	@JsonProperty("low")
	public void setLow(Double low) {
		this.low = low;
	}

	/**
	 * 
	 * @return The close
	 */
	@JsonProperty("close")
	public Double getClose() {
		return close;
	}

	/**
	 * 
	 * @param close
	 *            The close
	 */
	@JsonProperty("close")
	public void setClose(Double close) {
		this.close = close;
	}

	/**
	 * 
	 * @return The bidPrice
	 */
	@JsonProperty("bidPrice")
	public Double getBidPrice() {
		return bidPrice;
	}

	/**
	 * 
	 * @param bidPrice
	 *            The bidPrice
	 */
	@JsonProperty("bidPrice")
	public void setBidPrice(Double bidPrice) {
		this.bidPrice = bidPrice;
	}

	/**
	 * 
	 * @return The askPrice
	 */
	@JsonProperty("askPrice")
	public Double getAskPrice() {
		return askPrice;
	}

	/**
	 * 
	 * @param askPrice
	 *            The askPrice
	 */
	@JsonProperty("askPrice")
	public void setAskPrice(Double askPrice) {
		this.askPrice = askPrice;
	}

	/**
	 * 
	 * @return The askSize
	 */
	@JsonProperty("askSize")
	public Integer getAskSize() {
		return askSize;
	}

	/**
	 * 
	 * @param askSize
	 *            The askSize
	 */
	@JsonProperty("askSize")
	public void setAskSize(Integer askSize) {
		this.askSize = askSize;
	}

	/**
	 * 
	 * @return The bidSize
	 */
	@JsonProperty("bidSize")
	public Integer getBidSize() {
		return bidSize;
	}

	/**
	 * 
	 * @param bidSize
	 *            The bidSize
	 */
	@JsonProperty("bidSize")
	public void setBidSize(Integer bidSize) {
		this.bidSize = bidSize;
	}

	/**
	 * 
	 * @return The size
	 */
	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	/**
	 * 
	 * @param size
	 *            The size
	 */
	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * 
	 * @return The bidTime
	 */
	@JsonProperty("bidTime")
	public Integer getBidTime() {
		return bidTime;
	}

	/**
	 * 
	 * @param bidTime
	 *            The bidTime
	 */
	@JsonProperty("bidTime")
	public void setBidTime(Integer bidTime) {
		this.bidTime = bidTime;
	}

	/**
	 * 
	 * @return The askTime
	 */
	@JsonProperty("askTime")
	public Integer getAskTime() {
		return askTime;
	}

	/**
	 * 
	 * @param askTime
	 *            The askTime
	 */
	@JsonProperty("askTime")
	public void setAskTime(Integer askTime) {
		this.askTime = askTime;
	}

	/**
	 * 
	 * @return The lastTradePrice
	 */
	@JsonProperty("lastTradePrice")
	public Double getLastTradePrice() {
		return lastTradePrice;
	}

	/**
	 * 
	 * @param lastTradePrice
	 *            The lastTradePrice
	 */
	@JsonProperty("lastTradePrice")
	public void setLastTradePrice(Double lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}

	/**
	 * 
	 * @return The lastTradeTime
	 */
	@JsonProperty("lastTradeTime")
	public Integer getLastTradeTime() {
		return lastTradeTime;
	}

	/**
	 * 
	 * @param lastTradeTime
	 *            The lastTradeTime
	 */
	@JsonProperty("lastTradeTime")
	public void setLastTradeTime(Integer lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}

	/**
	 * 
	 * @return The volume
	 */
	@JsonProperty("volume")
	public Integer getVolume() {
		return volume;
	}

	/**
	 * 
	 * @param volume
	 *            The volume
	 */
	@JsonProperty("volume")
	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	/**
	 * 
	 * @return The change
	 */
	@JsonProperty("change")
	public Double getChange() {
		return change;
	}

	/**
	 * 
	 * @param change
	 *            The change
	 */
	@JsonProperty("change")
	public void setChange(Double change) {
		this.change = change;
	}

	/**
	 * 
	 * @return The changePercent
	 */
	@JsonProperty("changePercent")
	public Double getChangePercent() {
		return changePercent;
	}

	/**
	 * 
	 * @param changePercent
	 *            The changePercent
	 */
	@JsonProperty("changePercent")
	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}

	/**
	 * 
	 * @return The previousClosePrice
	 */
	@JsonProperty("previousClosePrice")
	public Double getPreviousClosePrice() {
		return previousClosePrice;
	}

	/**
	 * 
	 * @param previousClosePrice
	 *            The previousClosePrice
	 */
	@JsonProperty("previousClosePrice")
	public void setPreviousClosePrice(Double previousClosePrice) {
		this.previousClosePrice = previousClosePrice;
	}

	/**
	 * 
	 * @return The fiftyDayAveragePrice
	 */
	@JsonProperty("fiftyDayAveragePrice")
	public Double getFiftyDayAveragePrice() {
		return fiftyDayAveragePrice;
	}

	/**
	 * 
	 * @param fiftyDayAveragePrice
	 *            The fiftyDayAveragePrice
	 */
	@JsonProperty("fiftyDayAveragePrice")
	public void setFiftyDayAveragePrice(Double fiftyDayAveragePrice) {
		this.fiftyDayAveragePrice = fiftyDayAveragePrice;
	}

	/**
	 * 
	 * @return The fiftyTwoWeekHigh
	 */
	@JsonProperty("fiftyTwoWeekHigh")
	public Double getFiftyTwoWeekHigh() {
		return fiftyTwoWeekHigh;
	}

	/**
	 * 
	 * @param fiftyTwoWeekHigh
	 *            The fiftyTwoWeekHigh
	 */
	@JsonProperty("fiftyTwoWeekHigh")
	public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}

	/**
	 * 
	 * @return The fiftyTwoWeekLow
	 */
	@JsonProperty("fiftyTwoWeekLow")
	public Double getFiftyTwoWeekLow() {
		return fiftyTwoWeekLow;
	}

	/**
	 * 
	 * @param fiftyTwoWeekLow
	 *            The fiftyTwoWeekLow
	 */
	@JsonProperty("fiftyTwoWeekLow")
	public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}

	/**
	 * 
	 * @return The marketCap
	 */
	@JsonProperty("marketCap")
	public Integer getMarketCap() {
		return marketCap;
	}

	/**
	 * 
	 * @param marketCap
	 *            The marketCap
	 */
	@JsonProperty("marketCap")
	public void setMarketCap(Integer marketCap) {
		this.marketCap = marketCap;
	}

	/**
	 * 
	 * @return The sharesOutstanding
	 */
	@JsonProperty("sharesOutstanding")
	public Integer getSharesOutstanding() {
		return sharesOutstanding;
	}

	/**
	 * 
	 * @param sharesOutstanding
	 *            The sharesOutstanding
	 */
	@JsonProperty("sharesOutstanding")
	public void setSharesOutstanding(Integer sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	/**
	 * 
	 * @return The pe
	 */
	@JsonProperty("pe")
	public Double getPe() {
		return pe;
	}

	/**
	 * 
	 * @param pe
	 *            The pe
	 */
	@JsonProperty("pe")
	public void setPe(Double pe) {
		this.pe = pe;
	}

	/**
	 * 
	 * @return The forwardPE
	 */
	@JsonProperty("forwardPE")
	public Double getForwardPE() {
		return forwardPE;
	}

	/**
	 * 
	 * @param forwardPE
	 *            The forwardPE
	 */
	@JsonProperty("forwardPE")
	public void setForwardPE(Double forwardPE) {
		this.forwardPE = forwardPE;
	}

	/**
	 * 
	 * @return The dividendYield
	 */
	@JsonProperty("dividendYield")
	public Double getDividendYield() {
		return dividendYield;
	}

	/**
	 * 
	 * @param dividendYield
	 *            The dividendYield
	 */
	@JsonProperty("dividendYield")
	public void setDividendYield(Double dividendYield) {
		this.dividendYield = dividendYield;
	}

	/**
	 * 
	 * @return The payoutRatio
	 */
	@JsonProperty("payoutRatio")
	public Double getPayoutRatio() {
		return payoutRatio;
	}

	/**
	 * 
	 * @param payoutRatio
	 *            The payoutRatio
	 */
	@JsonProperty("payoutRatio")
	public void setPayoutRatio(Double payoutRatio) {
		this.payoutRatio = payoutRatio;
	}

	/**
	 * 
	 * @return The ethPrice
	 */
	@JsonProperty("ethPrice")
	public Double getEthPrice() {
		return ethPrice;
	}

	/**
	 * 
	 * @param ethPrice
	 *            The ethPrice
	 */
	@JsonProperty("ethPrice")
	public void setEthPrice(Double ethPrice) {
		this.ethPrice = ethPrice;
	}

	/**
	 * 
	 * @return The ethVolume
	 */
	@JsonProperty("ethVolume")
	public Integer getEthVolume() {
		return ethVolume;
	}

	/**
	 * 
	 * @param ethVolume
	 *            The ethVolume
	 */
	@JsonProperty("ethVolume")
	public void setEthVolume(Integer ethVolume) {
		this.ethVolume = ethVolume;
	}

	/**
	 * 
	 * @return The ethTime
	 */
	@JsonProperty("ethTime")
	public Integer getEthTime() {
		return ethTime;
	}

	/**
	 * 
	 * @param ethTime
	 *            The ethTime
	 */
	@JsonProperty("ethTime")
	public void setEthTime(Integer ethTime) {
		this.ethTime = ethTime;
	}

}