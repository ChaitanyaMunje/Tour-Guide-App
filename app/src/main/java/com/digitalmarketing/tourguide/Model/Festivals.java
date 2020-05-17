package com.digitalmarketing.tourguide.Model;

public class Festivals {
private String festivalname;
    private String festivalseason;
    private String festivaldesc;
    private int festivalimg;

    public String getFestivalname() {
        return festivalname;
    }

    public String getFestivalseason() {
        return festivalseason;
    }

    public String getFestivaldesc() {
        return festivaldesc;
    }

    public int getFestivalimg(){
        return festivalimg;
    }


    public Festivals(String festivalname, String festivalseason, String festivaldesc, int festivalimg) {
        this.festivalname = festivalname;
        this.festivalseason = festivalseason;
        this.festivaldesc = festivaldesc;
        this.festivalimg=festivalimg;
    }




}
