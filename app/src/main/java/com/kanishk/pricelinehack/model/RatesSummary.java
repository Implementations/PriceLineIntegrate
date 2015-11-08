
package com.kanishk.pricelinehack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatesSummary {

    @SerializedName("minPrice")
    @Expose
    private String minPrice;
    @SerializedName("minCurrencyCode")
    @Expose
    private String minCurrencyCode;
    @SerializedName("minCurrencyCodeSymbol")
    @Expose
    private String minCurrencyCodeSymbol;
    @SerializedName("pclnId")
    @Expose
    private String pclnId;
    @SerializedName("freeCancelableRateAvail")
    @Expose
    private Boolean freeCancelableRateAvail;
    @SerializedName("payWhenYouStayAvailable")
    @Expose
    private Boolean payWhenYouStayAvailable;
    @SerializedName("ccNotRequiredAvailable")
    @Expose
    private Boolean ccNotRequiredAvailable;

    /**
     * 
     * @return
     *     The minPrice
     */
    public String getMinPrice() {
        return minPrice;
    }

    /**
     * 
     * @param minPrice
     *     The minPrice
     */
    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    /**
     * 
     * @return
     *     The minCurrencyCode
     */
    public String getMinCurrencyCode() {
        return minCurrencyCode;
    }

    /**
     * 
     * @param minCurrencyCode
     *     The minCurrencyCode
     */
    public void setMinCurrencyCode(String minCurrencyCode) {
        this.minCurrencyCode = minCurrencyCode;
    }

    /**
     * 
     * @return
     *     The minCurrencyCodeSymbol
     */
    public String getMinCurrencyCodeSymbol() {
        return minCurrencyCodeSymbol;
    }

    /**
     * 
     * @param minCurrencyCodeSymbol
     *     The minCurrencyCodeSymbol
     */
    public void setMinCurrencyCodeSymbol(String minCurrencyCodeSymbol) {
        this.minCurrencyCodeSymbol = minCurrencyCodeSymbol;
    }

    /**
     * 
     * @return
     *     The pclnId
     */
    public String getPclnId() {
        return pclnId;
    }

    /**
     * 
     * @param pclnId
     *     The pclnId
     */
    public void setPclnId(String pclnId) {
        this.pclnId = pclnId;
    }

    /**
     * 
     * @return
     *     The freeCancelableRateAvail
     */
    public Boolean getFreeCancelableRateAvail() {
        return freeCancelableRateAvail;
    }

    /**
     * 
     * @param freeCancelableRateAvail
     *     The freeCancelableRateAvail
     */
    public void setFreeCancelableRateAvail(Boolean freeCancelableRateAvail) {
        this.freeCancelableRateAvail = freeCancelableRateAvail;
    }

    /**
     * 
     * @return
     *     The payWhenYouStayAvailable
     */
    public Boolean getPayWhenYouStayAvailable() {
        return payWhenYouStayAvailable;
    }

    /**
     * 
     * @param payWhenYouStayAvailable
     *     The payWhenYouStayAvailable
     */
    public void setPayWhenYouStayAvailable(Boolean payWhenYouStayAvailable) {
        this.payWhenYouStayAvailable = payWhenYouStayAvailable;
    }

    /**
     * 
     * @return
     *     The ccNotRequiredAvailable
     */
    public Boolean getCcNotRequiredAvailable() {
        return ccNotRequiredAvailable;
    }

    /**
     * 
     * @param ccNotRequiredAvailable
     *     The ccNotRequiredAvailable
     */
    public void setCcNotRequiredAvailable(Boolean ccNotRequiredAvailable) {
        this.ccNotRequiredAvailable = ccNotRequiredAvailable;
    }

}
