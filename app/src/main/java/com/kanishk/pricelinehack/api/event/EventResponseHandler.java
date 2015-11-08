package com.kanishk.pricelinehack.api.event;

import com.kanishk.pricelinehack.model.Hotel;
import com.kanishk.pricelinehack.model.Result;
import com.kanishk.pricelinehack.model.event.Event;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by kanishk on 11/7/15.
 */
public class EventResponseHandler implements Callback<List<Event>> {

    ResponseListener mCallbackListener;

    public EventResponseHandler(ResponseListener listener) {
        this.mCallbackListener = listener;
    }

    @Override
    public void success(List<Event> result, Response response) {
        mCallbackListener.returnResult(result);
    }

    @Override
    public void failure(RetrofitError error) {
        error.getUrl();
    }

    public interface ResponseListener {
        void returnResult(List<Event> event);

        void returnError(RetrofitError error);
    }
}
