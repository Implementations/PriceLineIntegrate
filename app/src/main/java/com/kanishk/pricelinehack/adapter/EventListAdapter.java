package com.kanishk.pricelinehack.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.kanishk.pricelinehack.Constant;
import com.kanishk.pricelinehack.R;
import com.kanishk.pricelinehack.model.event.Artist;
import com.kanishk.pricelinehack.model.event.Event;
import com.kanishk.pricelinehack.priceline.ListActivity;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanishk on 11/7/15.
 */
public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> implements
        View.OnClickListener {

    private List<Event> eventList;

    private Context mContext;

    public EventListAdapter(List<Event> hotelList, Context context) {
        this.eventList = hotelList;
        this.mContext = context;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);
        EventViewHolder vh = new EventViewHolder(v);
        vh.mTextEvent = (TextView) v.findViewById(R.id.event_location);
        vh.mTextArtist = (TextView) v.findViewById(R.id.artists);
        vh.mTextDate = (TextView) v.findViewById(R.id.date);
        vh.mTicket = (Button) v.findViewById(R.id.ticket);
        vh.mHotel = (Button) v.findViewById(R.id.hotel);
        return vh;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        Event event = eventList.get(position);
        String venue = event.getVenue().getName() +  "," + event. getVenue().getCity() +
                "," + event. getVenue().getCountry();
        holder.mTextEvent.setText(venue);
        String dateTime = Constant.APP_DISPLAY_FORMAT.print(new DateTime(event.getDatetime()));
        holder.mTextDate.setText(dateTime);
        StringBuilder sb = new StringBuilder();
        for(Artist a : event.getArtists()) {
            sb.append(a.getName()).append(",");
        }
        holder.mTextArtist.setText(sb.toString());
        holder.mTicket.setOnClickListener(this);
        holder.mHotel.setOnClickListener(this);
        holder.mTicket.setTag(event);
        holder.mHotel.setTag(event);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public void addList(List<Event> EventList) {
        this.eventList.addAll(EventList);
    }

    public void clearList() {
        this.eventList = new ArrayList<>();
    }

    @Override
    public void onClick(View v) {
        Event e = (Event) v.getTag();
        switch (v.getId()) {
            case R.id.hotel:
                Intent i = ListActivity.getStartIntent(mContext, e.getVenue().getCity(), e.getDatetime());
                mContext.startActivity(i);
                break;
            case R.id.ticket:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(e.getTicketUrl()));
                mContext.startActivity(browserIntent);
                break;
        }
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        TextView mTextEvent;
        TextView mTextDate;
        TextView mTextArtist;
        Button mTicket;
        Button mHotel;
        public EventViewHolder(View itemView) {
           super(itemView);
        }
    }
}
