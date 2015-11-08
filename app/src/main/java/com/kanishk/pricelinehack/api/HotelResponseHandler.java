package com.kanishk.pricelinehack.api;

import com.kanishk.pricelinehack.model.Hotel;
import com.kanishk.pricelinehack.model.Result;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by kanishk on 11/7/15.
 */
public class HotelResponseHandler implements Callback<Result> {

    ResponseListener mCallbackListener;

    public HotelResponseHandler(ResponseListener listener) {
        this.mCallbackListener = listener;
    }

    @Override
    public void success(Result result, Response response) {
        mCallbackListener.returnResult(result.getHotels());
    }

    @Override
    public void failure(RetrofitError error) {
        error.getUrl();
    }

    public interface ResponseListener {
        void returnResult(List<Hotel> hoteList);

        void returnError(RetrofitError error);
    }
}
