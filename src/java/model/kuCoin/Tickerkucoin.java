/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.kuCoin;


/**
 *
 * @author Dell
 */
public class Tickerkucoin {

    private String symbol;
    private String symbolName;
    private String buy;
    private String sell;
    private String changeRate;
    private String changePrice;
    private String high;
    private String low;
    private String vol;
    private String volValue;
    private String last;
    private String avgPrice;
    private String takerFeeRate;
    private String makerFeeRate;
    private String takerCoefficient;
    private String makerCoefficient;

    /**
     *
     * @return
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     *
     * @param symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     *
     * @return
     */
    public String getSymbolName() {
        return symbolName;
    }

    /**
     *
     * @param symbolName
     */
    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    /**
     *
     * @return
     */
    public String getBuy() {
        return buy;
    }

    /**
     *
     * @param buy
     */
    public void setBuy(String buy) {
        this.buy = buy;
    }

    /**
     *
     * @return
     */
    public String getSell() {
        return sell;
    }

    /**
     *
     * @param sell
     */
    public void setSell(String sell) {
        this.sell = sell;
    }

    /**
     *
     * @return
     */
    public String getChangeRate() {
        return changeRate;
    }

    /**
     *
     * @param changeRate
     */
    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate;
    }

    /**
     *
     * @return
     */
    public String getChangePrice() {
        return changePrice;
    }

    /**
     *
     * @param changePrice
     */
    public void setChangePrice(String changePrice) {
        this.changePrice = changePrice;
    }

    /**
     *
     * @return
     */
    public String getHigh() {
        return high;
    }

    /**
     *
     * @param high
     */
    public void setHigh(String high) {
        this.high = high;
    }

    /**
     *
     * @return
     */
    public String getLow() {
        return low;
    }

    /**
     *
     * @param low
     */
    public void setLow(String low) {
        this.low = low;
    }

    /**
     *
     * @return
     */
    public String getVol() {
        return vol;
    }

    /**
     *
     * @param vol
     */
    public void setVol(String vol) {
        this.vol = vol;
    }

    /**
     *
     * @return
     */
    public String getVolValue() {
        return volValue;
    }

    /**
     *
     * @param volValue
     */
    public void setVolValue(String volValue) {
        this.volValue = volValue;
    }

    /**
     *
     * @return
     */
    public String getLast() {
        return last;
    }

    /**
     *
     * @param last
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     *
     * @return
     */
    public String getAvgPrice() {
        return avgPrice;
    }

    /**
     *
     * @param avgPrice
     */
    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    /**
     *
     * @return
     */
    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    /**
     *
     * @param takerFeeRate
     */
    public void setTakerFeeRate(String takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    /**
     *
     * @return
     */
    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    /**
     *
     * @param makerFeeRate
     */
    public void setMakerFeeRate(String makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    /**
     *
     * @return
     */
    public String getTakerCoefficient() {
        return takerCoefficient;
    }

    /**
     *
     * @param takerCoefficient
     */
    public void setTakerCoefficient(String takerCoefficient) {
        this.takerCoefficient = takerCoefficient;
    }

    /**
     *
     * @return
     */
    public String getMakerCoefficient() {
        return makerCoefficient;
    }

    /**
     *
     * @param makerCoefficient
     */
    public void setMakerCoefficient(String makerCoefficient) {
        this.makerCoefficient = makerCoefficient;
    }

    @Override
    public String toString() {
        return "Tickerkucoin{" + "symbolName=" + symbolName + ", buy=" + buy + ", changeRate=" + changeRate + ", changePrice=" + changePrice + ", vol=" + vol + ", volValue=" + volValue + '}';
    }

    
}
