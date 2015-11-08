package com.kanishk.pricelinehack.priceline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;

import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.api.UrlRequest;

/**
 * Created by kanishk on 11/7/15.
 */
public class SearchFragment extends Fragment implements View.OnClickListener {

    private EditText mCheckin;

    private EditText mCheckout;

    private EditText mSearchBox;

    private EditText mMinRate;

    private EditText mMaxRate;

    private Spinner mRooms;

    private Button mSearch;

    private UrlRequest mRequest;

    private RatingBar mRating;

    private SearchClickCallBack callback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        mRooms = (Spinner) rootView.findViewById(R.id.room);
        mRequest = UrlRequest.get();
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.room_value, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mRooms.setAdapter(adapter);
        this.mCheckin = (EditText) rootView.findViewById(R.id.checkin);
        this.mCheckout = (EditText) rootView.findViewById(R.id.checkout);
        this.mSearchBox = (EditText) rootView.findViewById(R.id.searchText);
        this.mSearch = (Button) rootView.findViewById(R.id.searchButton);
        this.mRating = (RatingBar) rootView.findViewById(R.id.rating);
        this.mMinRate = (EditText) rootView.findViewById(R.id.minPrice);
        this.mMaxRate = (EditText) rootView.findViewById(R.id.maxPrice);
        init();
        mSearch.setOnClickListener(this);
        sendSearchRequest(false);
        return rootView;
    }

    private void init() {
        if(mRequest.searchText != null) {
            this.mSearchBox.setText(mRequest.searchText);
            this.mCheckin.setText(mRequest.checkin);
            this.mCheckout.setText(mRequest.checkout);
            this.mRooms.setSelection(0);
        }
    }

    public void addSearchCallBackListener(SearchClickCallBack listener) {
        this.callback = listener;
    }


    @Override
    public void onClick(View v) {
        sendSearchRequest(true);
    }

    private void sendSearchRequest(boolean hideKeyboard) {
        mRequest.reset();
        mRequest.star = mRating.getRating() == 0.0f? null :  Float.toString(mRating.getRating());
        mRequest.checkin = mCheckin.getText().toString();
        mRequest.checkout = mCheckout.getText().toString();
        mRequest.searchText = mSearchBox.getText().toString();
        if(callback != null) {
            if(hideKeyboard) {
                hideSoftKeyboard(getActivity());
            }
            callback.sendRequest(mRequest);
        }
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager)
                activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

    public interface SearchClickCallBack {

        void sendRequest(UrlRequest request);
    }
}
