package com.digitalmarketing.tourguide.Model;

public class TourSpots {
    private String SpotName;
    private String SpotTimings;
    private String SpotLocation;
    private String SpotDesc;
    private int SpotImgId;
    private String SpotFees;
    private String SpotRating;
    private String SpotUrl;


    public String getSpotName() {
        return SpotName;
    }

    public String getSpotTimings() {
        return SpotTimings;
    }

    public String getSpotLocation() {
        return SpotLocation;
    }

    public String getSpotDesc() {
        return SpotDesc;
    }

    public int getSpotImgId() {
        return SpotImgId;
    }

    public String getSpotFees() {
        return SpotFees;
    }

    public String getSpotRating(){
        return SpotRating;
    }
    public String getSpotUrl(){
        return SpotUrl;
    }


    public TourSpots(String spotName, String spotTimings, String spotLocation, String spotDesc, int spotImgId, String spotFees, String spotRating, String spotUrl) {
        SpotName = spotName;
        SpotTimings = spotTimings;
        SpotLocation = spotLocation;
        SpotDesc = spotDesc;
        SpotImgId = spotImgId;
        SpotFees = spotFees;
        SpotRating=spotRating;
        SpotUrl=spotUrl;
    }



}
