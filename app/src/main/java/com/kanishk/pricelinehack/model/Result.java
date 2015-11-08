
package com.kanishk.pricelinehack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {

    @SerializedName("resultCode")
    @Expose
    private Long resultCode;
    @SerializedName("resultMessage")
    @Expose
    private String resultMessage;
    @SerializedName("duration")
    @Expose
    private Long duration;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("rguid")
    @Expose
    private String rguid;
    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("totalSize")
    @Expose
    private Long totalSize;
    @SerializedName("sortType")
    @Expose
    private String sortType;
    @SerializedName("errorCode")
    @Expose
    private Long errorCode;
    @SerializedName("hotels")
    @Expose
    private List<Hotel> hotels = new ArrayList<Hotel>();
    @SerializedName("cityInfo")
    @Expose
    private CityInfo cityInfo;

    /**
     * 
     * @return
     *     The resultCode
     */
    public Long getResultCode() {
        return resultCode;
    }

    /**
     * 
     * @param resultCode
     *     The resultCode
     */
    public void setResultCode(Long resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 
     * @return
     *     The resultMessage
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * 
     * @param resultMessage
     *     The resultMessage
     */
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The rguid
     */
    public String getRguid() {
        return rguid;
    }

    /**
     * 
     * @param rguid
     *     The rguid
     */
    public void setRguid(String rguid) {
        this.rguid = rguid;
    }

    /**
     * 
     * @return
     *     The src
     */
    public String getSrc() {
        return src;
    }

    /**
     * 
     * @param src
     *     The src
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * 
     * @return
     *     The totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    /**
     * 
     * @param totalSize
     *     The totalSize
     */
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * 
     * @return
     *     The sortType
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * 
     * @param sortType
     *     The sortType
     */
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    /**
     * 
     * @return
     *     The errorCode
     */
    public Long getErrorCode() {
        return errorCode;
    }

    /**
     * 
     * @param errorCode
     *     The errorCode
     */
    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     The hotels
     */
    public List<Hotel> getHotels() {
        return hotels;
    }

    /**
     * 
     * @param hotels
     *     The hotels
     */
    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    /**
     * 
     * @return
     *     The cityInfo
     */
    public CityInfo getCityInfo() {
        return cityInfo;
    }

    /**
     * 
     * @param cityInfo
     *     The cityInfo
     */
    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

}
