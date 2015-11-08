
package com.kanishk.pricelinehack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class HotelFeatures {

    @SerializedName("hotelAmenityCodes")
    @Expose
    private List<String> hotelAmenityCodes = new ArrayList<String>();

    /**
     * 
     * @return
     *     The hotelAmenityCodes
     */
    public List<String> getHotelAmenityCodes() {
        return hotelAmenityCodes;
    }

    /**
     * 
     * @param hotelAmenityCodes
     *     The hotelAmenityCodes
     */
    public void setHotelAmenityCodes(List<String> hotelAmenityCodes) {
        this.hotelAmenityCodes = hotelAmenityCodes;
    }

}
