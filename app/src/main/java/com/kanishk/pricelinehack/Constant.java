package com.kanishk.pricelinehack;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;

/**
 * Created by kanishk on 11/7/15.
 */
public class Constant {

    public static final String HOST = "http://www.priceline.com/pws/v0/stay/retail/listing";
    public static final String EVENT_HOST = "http://api.bandsintown.com/artists";

    public static final String CHECKIN = "check-in";
    public static final String CHECKOUT = "check-out";
    public static final String ROOMS = "rooms";
    public static final String OFFSET = "offset";
    public static final String PAGE_SIZE = "page-size";
    public static final String SORT = "sort";
    public static final String RESPONSE_OPTION = "response-options";
    public static final String rguid = "rguid";
    public static final String MIN_PRICE = "min-Price";
    public static final String MAX_PRICE = "MAX_PRICE";
    public static final String STAR = "star-ratings";
    public static final String AMENITIES = "amenities";
    public static final String MIN_GUEST_RATINGS = "min-guestrating";
    public static final String MAX_GUEST_RATINGS = "max-guestrating";
    public static final String HOTEL_NAME = "hotel-name";

    public static final String CITY = "city";

    public static final String DATE = "date";

    /** The Constant MAX_MEMORY_SIZE. */
    public static final int MAX_MEMORY_SIZE = 4 * 1024 * 1024;

    /** The Constant IMAGE_THREAD_POOL. */
    public static final int IMAGE_THREAD_POOL = Runtime.getRuntime().availableProcessors() + 2;

    /** The Constant IMAGE_CACHE_PERCENT. The size of memory cache as percentage
     * of available memory*/
    public static final int IMAGE_CACHE_PERCENT = 10;

    public static final DisplayImageOptions IMAGE_DISPLAY_OPTIONS;
    static{
        IMAGE_DISPLAY_OPTIONS = new DisplayImageOptions.Builder()
                .showImageForEmptyUri(R.drawable.no_image).showImageOnFail(R.drawable.no_image)
                .cacheOnDisk(true).cacheInMemory(true).showImageOnLoading(R.drawable.no_image).build();
    }

    public static final DateTimeFormatter PRICELINE_DATE = DateTimeFormat.forPattern("yyyyMMdd");
    public static final DateTimeFormatter APP_DISPLAY_FORMAT = DateTimeFormat.forPattern("MMM dd yyyy");
}
