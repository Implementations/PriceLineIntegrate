package com.kanishk.pricelinehack.priceline;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.api.UrlRequest;

public class DetailActivity extends FragmentActivity implements View.OnClickListener, SearchFragment.
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
        this.mSearchFragment = new SearchFragment();
        mSearchFragment.addSearchCallBackListener(this);
        this.mListFragment = new ListFragment();
        this.mFragmentContainer = findViewById(R.id.search_fragment_container);
        getSupportFragmentManager().beginTransaction().
                add(R.id.search_fragment_container, mSearchFragment, SEARCH_TAG).commit();
        getSupportFragmentManager().beginTransaction().
                add(R.id.list_fragment_container, mListFragment, LIST_TAG).commit();
        mToggleSearch = (Button) findViewById(R.id.toggle);
        Button mPrev = (Button) findViewById(R.id.prev);
        Button mNext = (Button) findViewById(R.id.next);
        mToggleSearch.setOnClickListener(this);
        mPrev.setOnClickListener(this);
        mNext.setOnClickListener(this);
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

    @Override
    public void sendRequest(UrlRequest request) {
        hideSoftKeyboard(this);
        toggleSearch(mShow);
        mListFragment.fetchResult(request);
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager)
                activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }
}
