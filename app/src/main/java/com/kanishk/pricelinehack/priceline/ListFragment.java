package com.kanishk.pricelinehack.priceline;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.adapter.RecyclerListAdapter;
import com.kanishk.pricelinehack.api.HotelResponseHandler;
import com.kanishk.pricelinehack.api.RestClient;
import com.kanishk.pricelinehack.api.UrlRequest;
import com.kanishk.pricelinehack.model.Hotel;

import java.util.ArrayList;
import java.util.List;

import retrofit.RetrofitError;

/**
 * Created by kanishk on 11/7/15.
 */
public class ListFragment extends Fragment implements HotelResponseHandler.ResponseListener {

    private RecyclerView mRecyclerView;

    private RecyclerListAdapter mAdapter;

    /** The progress dialogue bar. */
    private ProgressDialog progress;

    private LinearLayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_display, container, false);
        this.mRecyclerView = (RecyclerView) rootView.findViewById(R.id.item_list);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        setProgressDialogue();
        mAdapter = new RecyclerListAdapter(new ArrayList<Hotel>());
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

    private void setProgressDialogue() {
        progress = new ProgressDialog(getActivity());
        progress.setMessage(getString(R.string.progress));
        progress.setIndeterminate(false);
        progress.setOnCancelListener(null);
        progress.setTitle(null);
        progress.setCancelable(false);
    }

    public void fetchResult(UrlRequest request) {
        progress.show();
        this.mAdapter.clearList();
        RestClient.get().returnResult(request, new HotelResponseHandler(this));
    }

    @Override
    public void returnResult(List<Hotel> hoteList) {
        progress.dismiss();
        this.mAdapter.addList(hoteList);
        this.mAdapter.notifyDataSetChanged();
    }

    @Override
    public void returnError(RetrofitError error) {
        progress.dismiss();
        Toast.makeText(getActivity(), R.string.error, Toast.LENGTH_SHORT);
    }
}
