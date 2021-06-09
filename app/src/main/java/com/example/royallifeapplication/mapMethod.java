package com.example.royallifeapplication;

public class mapMethod {
    public final String mapAddrDefautl = "https://www.google.com/maps/search/";
    public final String zoomDefault = "10z/data=!3m1!4b1";
    private String mapAddress;
    private String searchString;

    //kinh độ
    private double longitude;

    //Vĩ độ
    private double latitude;

    public void setLongitude() {
        this.longitude = MainActivity.longtitude;
    }

    public void setLatitude() {
        this.latitude = MainActivity.latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }



    public mapMethod() {
    }
}
