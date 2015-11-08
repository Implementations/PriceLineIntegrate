
package com.kanishk.pricelinehack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("addressLine1")
    @Expose
    private String addressLine1;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("provinceCode")
    @Expose
    private String provinceCode;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("isoCountryCode")
    @Expose
    private String isoCountryCode;

    /**
     * 
     * @return
     *     The addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * 
     * @param addressLine1
     *     The addressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * 
     * @return
     *     The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 
     * @return
     *     The provinceCode
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 
     * @param provinceCode
     *     The provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * 
     * @param zip
     *     The zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The isoCountryCode
     */
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    /**
     * 
     * @param isoCountryCode
     *     The isoCountryCode
     */
    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

}
