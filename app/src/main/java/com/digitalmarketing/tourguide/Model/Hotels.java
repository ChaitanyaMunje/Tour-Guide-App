package com.digitalmarketing.tourguide.Model;

public class Hotels {
    private String HotelName;
    private String Rating;
    private int ImgId;
    private String Price;
    private String HotelUrl;

    public String getHotelName() {
        return HotelName;
    }

    public String getRating() {
        return Rating;
    }

    public int getImgId() {
        return ImgId;
    }

    public String getPrice() {
        return Price;
    }

    public String getHotelUrl() {
        return HotelUrl;
    }



    public Hotels(String hotelName, String rating, int imgId, String price, String hotelUrl) {
        HotelName = hotelName;
        Rating = rating;
        ImgId = imgId;
        Price = price;
        HotelUrl = hotelUrl;
    }
}
