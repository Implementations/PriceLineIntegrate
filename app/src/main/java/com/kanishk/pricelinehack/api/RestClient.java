package com.kanishk.pricelinehack.api;

import android.util.Log;

import com.google.gson.Gson;
import com.kanishk.pricelinehack.Constant;
import com.kanishk.pricelinehack.model.Result;
import com.squareup.okhttp.OkHttpClient;

import retrofit.Callback;
import retrofit.ErrorHandler;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by kanishk on 11/7/15.
 */
public class RestClient {

    private static final String TAG = RestClient.class.getName();

    private static final RestClient CLIENT = new RestClient();

    private final RestAdapter mRestAdapter = new RestAdapter.Builder()
            .setEndpoint(Constant.HOST)
            .setClient(new OkClient(new OkHttpClient()))
            .setRequestInterceptor(new SessionRequestInterceptor())
            .setErrorHandler(new MyErrorHandler())
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .build();

    private RestService mRestService = mRestAdapter.create(RestService.class);

    private RestClient() {
    }

    public static RestClient get() {
        return CLIENT;
    }

    public void returnResult(UrlRequest request, HotelResponseHandler hotelResponseHandler) {
        mRestService.getResults(request.searchText, request.amenities, request.rooms, request.offset, request.checkin,
                request.checkout, request.pageSize, request.sort, request.responseOption, request.rguid,
                request.minPrice, request.maxPrice, request.star, hotelResponseHandler);
    }

    public interface RestService {
        @GET("/{searchId}")
        void getResults(@Path("searchId") String searchId, @Query(Constant.AMENITIES) String amenities,
                        @Query(Constant.ROOMS) int rooms, @Query(Constant.OFFSET) int offset,
                        @Query(Constant.CHECKIN) String checkin, @Query(Constant.CHECKOUT) String checkout,
                        @Query(Constant.PAGE_SIZE) int pageSize, @Query(Constant.SORT) String sort,
                        @Query(Constant.RESPONSE_OPTION) String responseOpt, @Query(Constant.rguid) String rugid,
                        @Query(Constant.MIN_PRICE) String minPrice, @Query(Constant.MAX_PRICE) String maxPrice,
                        @Query(Constant.STAR) String star, Callback<Result> responseHandler);

    }

    private class MyErrorHandler implements ErrorHandler {
        @Override public Throwable handleError(RetrofitError cause) {
            Response r = cause.getResponse();
            if (r != null) {
                Log.d(TAG, r.getReason() + r.getUrl() + r.getStatus());
            }
            return cause;
        }
    }
}
