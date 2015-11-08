package com.kanishk.pricelinehack.api;

/**
 * Created by kanishk on 11/7/15.
 */
public class UrlRequest {

    private static final UrlRequest REQUEST = new UrlRequest();

    private static final int DEFAULT_ITEMS_PERPAGE = 15;

    public String amenities;
    public String checkin;
    public String checkout;
    public int rooms;
    public int offset;
    public int pageSize;
    public String sort;
    public String responseOption;
    public String rguid;
    public String minPrice;
    public String maxPrice;
    public String star;
    public String searchText;



    private UrlRequest() {
        pageSize = DEFAULT_ITEMS_PERPAGE;
        offset = 0;
        rguid = "3459hjdfdf";
        rooms = 1;
    }

    public void reset() {
        this.amenities = null;
        this.sort = null;
        this.checkin = null;
        this.checkout = null;
        this.pageSize = DEFAULT_ITEMS_PERPAGE;
        this.offset = 0;
        this.rooms = 1;
        this.minPrice = null;
        this.maxPrice = null;
        this.responseOption =null;
        this.star = null;
        this.searchText = "";
    }

    public static UrlRequest get() {
        return REQUEST;
    }
    
}
