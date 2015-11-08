
package com.kanishk.pricelinehack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Hotel {

    @SerializedName("hotelId")
    @Expose
    private String hotelId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brandId")
    @Expose
    private String brandId;
    @SerializedName("starRating")
    @Expose
    private Double starRating;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("hotelFeatures")
    @Expose
    private HotelFeatures hotelFeatures;
    @SerializedName("overallGuestRating")
    @Expose
    private Double overallGuestRating;
    @SerializedName("totalReviewCount")
    @Expose
    private Long totalReviewCount;
    @SerializedName("guestReviewGdsName")
    @Expose
    private String guestReviewGdsName;
    @SerializedName("proximity")
    @Expose
    private Double proximity;
    @SerializedName("chainCode")
    @Expose
    private String chainCode;
    @SerializedName("ratesSummary")
    @Expose
    private RatesSummary ratesSummary;
    @SerializedName("allInclusiveRateProperty")
    @Expose
    private Boolean allInclusiveRateProperty;
    @SerializedName("recentlyViewed")
    @Expose
    private Boolean recentlyViewed;
    @SerializedName("dealUnwrapable")
    @Expose
    private Boolean dealUnwrapable;

    /**
     * 
     * @return
     *     The hotelId
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * 
     * @param hotelId
     *     The hotelId
     */
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The brandId
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * 
     * @param brandId
     *     The brandId
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * 
     * @return
     *     The starRating
     */
    public Double getStarRating() {
        return starRating;
    }

    /**
     * 
     * @param starRating
     *     The starRating
     */
    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * 
     * @param thumbnailUrl
     *     The thumbnailUrl
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * 
     * @return
     *     The hotelFeatures
     */
    public HotelFeatures getHotelFeatures() {
        return hotelFeatures;
    }

    /**
     * 
     * @param hotelFeatures
     *     The hotelFeatures
     */
    public void setHotelFeatures(HotelFeatures hotelFeatures) {
        this.hotelFeatures = hotelFeatures;
    }

    /**
     * 
     * @return
     *     The overallGuestRating
     */
    public Double getOverallGuestRating() {
        return overallGuestRating;
    }

    /**
     * 
     * @param overallGuestRating
     *     The overallGuestRating
     */
    public void setOverallGuestRating(Double overallGuestRating) {
        this.overallGuestRating = overallGuestRating;
    }

    /**
     * 
     * @return
     *     The totalReviewCount
     */
    public Long getTotalReviewCount() {
        return totalReviewCount;
    }

    /**
     * 
     * @param totalReviewCount
     *     The totalReviewCount
     */
    public void setTotalReviewCount(Long totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

    /**
     * 
     * @return
     *     The guestReviewGdsName
     */
    public String getGuestReviewGdsName() {
        return guestReviewGdsName;
    }

    /**
     * 
     * @param guestReviewGdsName
     *     The guestReviewGdsName
     */
    public void setGuestReviewGdsName(String guestReviewGdsName) {
        this.guestReviewGdsName = guestReviewGdsName;
    }

    /**
     * 
     * @return
     *     The proximity
     */
    public Double getProximity() {
        return proximity;
    }

    /**
     * 
     * @param proximity
     *     The proximity
     */
    public void setProximity(Double proximity) {
        this.proximity = proximity;
    }

    /**
     * 
     * @return
     *     The chainCode
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * 
     * @param chainCode
     *     The chainCode
     */
    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    /**
     * 
     * @return
     *     The ratesSummary
     */
    public RatesSummary getRatesSummary() {
        return ratesSummary;
    }

    /**
     * 
     * @param ratesSummary
     *     The ratesSummary
     */
    public void setRatesSummary(RatesSummary ratesSummary) {
        this.ratesSummary = ratesSummary;
    }

    /**
     * 
     * @return
     *     The allInclusiveRateProperty
     */
    public Boolean getAllInclusiveRateProperty() {
        return allInclusiveRateProperty;
    }

    /**
     * 
     * @param allInclusiveRateProperty
     *     The allInclusiveRateProperty
     */
    public void setAllInclusiveRateProperty(Boolean allInclusiveRateProperty) {
        this.allInclusiveRateProperty = allInclusiveRateProperty;
    }

    /**
     * 
     * @return
     *     The recentlyViewed
     */
    public Boolean getRecentlyViewed() {
        return recentlyViewed;
    }

    /**
     * 
     * @param recentlyViewed
     *     The recentlyViewed
     */
    public void setRecentlyViewed(Boolean recentlyViewed) {
        this.recentlyViewed = recentlyViewed;
    }

    /**
     * 
     * @return
     *     The dealUnwrapable
     */
    public Boolean getDealUnwrapable() {
        return dealUnwrapable;
    }

    /**
     * 
     * @param dealUnwrapable
     *     The dealUnwrapable
     */
    public void setDealUnwrapable(Boolean dealUnwrapable) {
        this.dealUnwrapable = dealUnwrapable;
    }

}
