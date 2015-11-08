package com.kanishk.pricelinehack.priceline;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import com.kanishk.pricelinehack.Constant;
import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.api.UrlRequest;

import org.joda.time.DateTime;

public class ListActivity extends FragmentActivity implements View.OnClickListener, SearchFragment.
        SearchClickCallBack {

    private Button mToggleSearch;

    private boolean mShow;

    private SearchFragment mSearchFragment;

    private ListFragment mListFragment;

    private View mFragmentContainer;

    private int pageOffset;

    private static final String LIST_TAG = ListFragment.class.getName();

    private static final String SEARCH_TAG = SearchFragment.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        this.mShow = true;
        formRequestFromIntentData(getIntent());
        this.mSearchFragment = new SearchFragment();
        mSearchFragment.addSearchCallBackListener(this);
        this.mListFragment = new ListFragment();
        this.mFragmentContainer = findViewById(R.id.search_fragment_container);
        getSupportFragmentManager().beginTransaction().
                add(R.id.list_fragment_container, mListFragment, LIST_TAG).commit();
        getSupportFragmentManager().beginTransaction().
                add(R.id.search_fragment_container, mSearchFragment, SEARCH_TAG).commit();
        mToggleSearch = (Button) findViewById(R.id.toggle);
        Button mPrev = (Button) findViewById(R.id.prev);
        Button mNext = (Button) findViewById(R.id.next);
        mToggleSearch.setOnClickListener(this);
        mPrev.setOnClickListener(this);
        mNext.setOnClickListener(this);
//        sendRequest(UrlRequest.get());
    }



    @Override
    public void onClick(View v) {
        UrlRequest urlRequest = UrlRequest.get();
        switch (v.getId()) {
            case R.id.toggle:
                toggleSearch(mShow);
                break;
            case R.id.next:
                pageOffset++;
                urlRequest.offset = this.pageOffset;
                mListFragment.fetchResult(urlRequest);
                break;
            case R.id.prev:
                if (pageOffset > 0) {
                    pageOffset--;
                    urlRequest.offset = this.pageOffset;
                    mListFragment.fetchResult(urlRequest);
                }
                break;
            default:
        }
    }

    private void toggleSearch(boolean isVisible) {
        if (isVisible) {
            mShow = false;
            mFragmentContainer.setVisibility(View.GONE);
            mToggleSearch.setTextSize(20);
            mToggleSearch.setText(R.string.down);
        } else {
            mShow = true;
            mFragmentContainer.setVisibility(View.VISIBLE);
            mToggleSearch.setTextSize(40);
            mToggleSearch.setText(R.string.up);
        }
    }

    private UrlRequest formRequestFromIntentData(Intent intent) {
        String city = intent.getStringExtra(Constant.CITY);
        String checkInDate = intent.getStringExtra(Constant.DATE);
        DateTime checkin = new DateTime(checkInDate);
        DateTime checkOutDate = checkin.plusDays(1);
        String checkOutStringFormat = Constant.PRICELINE_DATE.print(checkOutDate);
        checkInDate = Constant.PRICELINE_DATE.print(checkin);
        UrlRequest request = UrlRequest.get();
        request.checkin = checkInDate;
        request.checkout = checkOutStringFormat;
        request.searchText = city;
        return request;
    }

    @Override
    public void sendRequest(UrlRequest request) {
        toggleSearch(mShow);
        mListFragment.fetchResult(request);
    }


    public static Intent getStartIntent(Context context, String city, String date) {
        Intent intent = new Intent(context, ListActivity.class);
        intent.putExtra(Constant.CITY, city);
        intent.putExtra(Constant.DATE, date);
        return intent;
    }
}
