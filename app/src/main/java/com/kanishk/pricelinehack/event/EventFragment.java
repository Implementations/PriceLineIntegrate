package com.kanishk.pricelinehack.event;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.adapter.EventListAdapter;
import com.kanishk.pricelinehack.adapter.RecyclerListAdapter;
import com.kanishk.pricelinehack.api.HotelResponseHandler;
import com.kanishk.pricelinehack.api.RestClient;
import com.kanishk.pricelinehack.api.UrlRequest;
import com.kanishk.pricelinehack.api.event.EventApi;
import com.kanishk.pricelinehack.api.event.EventResponseHandler;
import com.kanishk.pricelinehack.model.Hotel;
import com.kanishk.pricelinehack.model.event.Artist;
import com.kanishk.pricelinehack.model.event.Event;
import com.kanishk.pricelinehack.priceline.SearchFragment;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import retrofit.RetrofitError;

/**
 * Created by kanishk on 11/7/15.
 */
public class EventFragment extends Fragment implements EventResponseHandler.ResponseListener {

    private RecyclerView mRecyclerView;

    private EventListAdapter mAdapter;

    /** The progress dialogue bar. */
    private ProgressDialog progress;

    private LinearLayoutManager mLayoutManager;

    private EditText searchText;

    private ImageButton searchButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_fragment_display, container, false);
        this.mRecyclerView = (RecyclerView) rootView.findViewById(R.id.item_list);
        this.searchText = (EditText) rootView.findViewById(R.id.searchText);
        this.searchButton = (ImageButton) rootView.findViewById(R.id.searchButton);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        setSearchClick();
        setProgressDialogue();
        mAdapter = new EventListAdapter(new ArrayList<Event>(), getActivity());
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

    private void setSearchClick() {
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = searchText.getText().toString();
                if(!value.isEmpty()) {
                    fetchResult(value);
                    SearchFragment.hideSoftKeyboard(getActivity());
                }
            }
        });
    }

    private void setProgressDialogue() {
        progress = new ProgressDialog(getActivity());
        progress.setMessage(getString(R.string.progress));
        progress.setIndeterminate(false);
        progress.setOnCancelListener(null);
        progress.setTitle(null);
        progress.setCancelable(false);
    }

    public void fetchResult(String request) {
        progress.show();
        this.mAdapter.clearList();
        EventApi.get().returnResult(request, new EventResponseHandler(this));
    }

    @Override
    public void returnResult(List<Event> eventList) {
        progress.dismiss();
        this.mAdapter.addList(eventList);
        this.mAdapter.notifyDataSetChanged();
    }

    @Override
    public void returnError(RetrofitError error) {
        progress.dismiss();
        Toast.makeText(getActivity(), R.string.error, Toast.LENGTH_SHORT);
    }
}
