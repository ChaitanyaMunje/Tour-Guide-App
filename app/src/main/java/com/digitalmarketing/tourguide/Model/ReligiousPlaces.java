package com.digitalmarketing.tourguide.Model;

public class ReligiousPlaces {
    private String TempleName;
    private String TempleTiming;
    private String TempleLocation;
    private int TempleImgId;
    private String TempleDesc;
    private String TrmpleGod;

    public String getTempleName() {
        return TempleName;
    }

    public String getTempleTiming() {
        return TempleTiming;
    }

    public String getTempleLocation() {
        return TempleLocation;
    }

    public int getTempleImgId() {
        return TempleImgId;
    }

    public String getTempleDesc() {
        return TempleDesc;
    }

    public String getTrmpleGod() {
        return TrmpleGod;
    }

    public ReligiousPlaces(String templeName, String templeTiming, String templeLocation, int templeImgId, String templeDesc, String trmpleGod) {
        TempleName = templeName;
        TempleTiming = templeTiming;
        TempleLocation = templeLocation;
        TempleImgId = templeImgId;
        TempleDesc = templeDesc;
        TrmpleGod = trmpleGod;
    }
}
