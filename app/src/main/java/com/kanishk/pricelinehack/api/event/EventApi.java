package com.kanishk.pricelinehack.api.event;

import android.util.Log;

import com.kanishk.pricelinehack.Constant;
import com.kanishk.pricelinehack.api.SessionRequestInterceptor;
import com.kanishk.pricelinehack.api.UrlRequest;
import com.kanishk.pricelinehack.model.Result;
import com.kanishk.pricelinehack.model.event.Event;
import com.squareup.okhttp.OkHttpClient;

import java.util.List;

import retrofit.Callback;
import retrofit.ErrorHandler;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by kanishk on 11/7/15.
 */
public class EventApi {

    private static final String TAG = EventApi.class.getName();

    private static final EventApi CLIENT = new EventApi();

    private final RestAdapter mRestAdapter = new RestAdapter.Builder()
            .setEndpoint(Constant.EVENT_HOST)
            .setClient(new OkClient(new OkHttpClient()))
            .setRequestInterceptor(new SessionRequestInterceptor())
            .setErrorHandler(new MyErrorHandler())
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .build();

    private EventService mRestService = mRestAdapter.create(EventService.class);

    private EventApi() {
    }

    public static EventApi get() {
        return CLIENT;
    }

    public void returnResult(String artist, EventResponseHandler eventResponseHandler) {
        mRestService.getResults(artist, eventResponseHandler);
    }

    public interface EventService {
        @GET("/{artists}/events.json")
        void getResults(@Path("artists") String artist, Callback<List<Event>> responseHandler);

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
