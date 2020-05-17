package com.digitalmarketing.tourguide.Model;

public class Park {
    private String ParkName;
    private String ParkTiming;
    private String ParkLocation;
    private String ParkRating;
    private String ParkDesc;
    private int ParkImgId;

    public int getParkImgId(){
        return ParkImgId;
    }

    public String getParkName() {
        return ParkName;
    }

    public String getParkTiming() {
        return ParkTiming;
    }

    public String getParkLocation() {
        return ParkLocation;
    }

    public String getParkRating() {
        return ParkRating;
    }

    public String getParkDesc() {
        return ParkDesc;
    }

    public Park(int parkImgId,String parkName, String parkTiming, String parkLocation, String parkRating, String parkDesc) {
        ParkImgId=parkImgId;
        ParkName = parkName;
        ParkTiming = parkTiming;
        ParkLocation = parkLocation;
        ParkRating = parkRating;
        ParkDesc = parkDesc;
    }
}
