
package com.kanishk.pricelinehack.model.event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Event {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("ticket_url")
    @Expose
    private String ticketUrl;
    @SerializedName("artists")
    @Expose
    private List<Artist> artists = new ArrayList<Artist>();
    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("ticket_status")
    @Expose
    private String ticketStatus;
    @SerializedName("on_sale_datetime")
    @Expose
    private String onSaleDatetime;

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * 
     * @param datetime
     *     The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * @return
     *     The ticketUrl
     */
    public String getTicketUrl() {
        return ticketUrl;
    }

    /**
     * 
     * @param ticketUrl
     *     The ticket_url
     */
    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    /**
     * 
     * @return
     *     The artists
     */
    public List<Artist> getArtists() {
        return artists;
    }

    /**
     * 
     * @param artists
     *     The artists
     */
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    /**
     * 
     * @return
     *     The venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * 
     * @param venue
     *     The venue
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    /**
     * 
     * @return
     *     The ticketStatus
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * 
     * @param ticketStatus
     *     The ticket_status
     */
    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    /**
     * 
     * @return
     *     The onSaleDatetime
     */
    public String getOnSaleDatetime() {
        return onSaleDatetime;
    }

    /**
     * 
     * @param onSaleDatetime
     *     The on_sale_datetime
     */
    public void setOnSaleDatetime(String onSaleDatetime) {
        this.onSaleDatetime = onSaleDatetime;
    }

}
