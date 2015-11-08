
package com.kanishk.pricelinehack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("neighborhoodId")
    @Expose
    private String neighborhoodId;
    @SerializedName("neighborhoodName")
    @Expose
    private String neighborhoodName;
    @SerializedName("cityId")
    @Expose
    private Long cityId;
    @SerializedName("zoneId")
    @Expose
    private String zoneId;

    /**
     * 
     * @return
     *     The address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * @param timeZone
     *     The timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 
     * @return
     *     The neighborhoodId
     */
    public String getNeighborhoodId() {
        return neighborhoodId;
    }

    /**
     * 
     * @param neighborhoodId
     *     The neighborhoodId
     */
    public void setNeighborhoodId(String neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    /**
     * 
     * @return
     *     The neighborhoodName
     */
    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    /**
     * 
     * @param neighborhoodName
     *     The neighborhoodName
     */
    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    /**
     * 
     * @return
     *     The cityId
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 
     * @param cityId
     *     The cityId
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 
     * @return
     *     The zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * 
     * @param zoneId
     *     The zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
