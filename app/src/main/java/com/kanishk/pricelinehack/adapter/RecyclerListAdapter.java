package com.kanishk.pricelinehack.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kanishk.pricelinehack.Constant;
import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.model.Hotel;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanishk on 11/7/15.
 */
public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerListAdapter.HotelViewHolder> {

    private List<Hotel> hotelList;

    private ImageLoader imageLoader;

    public RecyclerListAdapter(List<Hotel> hotelList) {
        this.hotelList = hotelList;
        this.imageLoader = ImageLoader.getInstance();
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        HotelViewHolder vh = new HotelViewHolder(v);
        vh.mIageView = (ImageView) v.findViewById(R.id.hotel_image);
        vh.mTextHotel = (TextView) v.findViewById(R.id.hotel_name);
        vh.mRating = (TextView) v.findViewById(R.id.rating);
        vh.mMinPrice = (TextView) v.findViewById(R.id.minPrice);
        return vh;
    }

    @Override
    public void onBindViewHolder(HotelViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.mMinPrice.setText(hotel.getRatesSummary().getMinCurrencyCodeSymbol() +
                hotel.getRatesSummary().getMinPrice());
        holder.mRating.setText(hotel.getStarRating().toString());
        String hotelName = hotel.getName();
        if(hotelName.length() > 60) {
            holder.mTextHotel.setText(hotel.getName().substring(0, 58) + "...");
        } else {
            holder.mTextHotel.setText(hotel.getName());
        }
        imageLoader.displayImage(hotel.getThumbnailUrl(), holder.mIageView,
                Constant.IMAGE_DISPLAY_OPTIONS);
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    public void addList(List<Hotel> hotelList) {
        this.hotelList.addAll(hotelList);
    }

    public void clearList() {
        this.hotelList = new ArrayList<>();
    }

    public static class HotelViewHolder extends RecyclerView.ViewHolder {

        TextView mTextHotel;
        TextView mRating;
        TextView mMinPrice;
        ImageView mIageView;

        public HotelViewHolder(View itemView) {
           super(itemView);
        }
    }
}
