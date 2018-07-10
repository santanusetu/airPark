package com.visahackathon.airpark;

public class ParkingPlace {

    // Store the image
    private int mImageDrawable;
    // Store the details of the location
    private String mName;
    // Store the Location
    private String mLocation;

    // Constructor that is used to create an instance of the Parking Place object
    public ParkingPlace(int mImageDrawable, String mName, String mLocation) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mLocation = mLocation;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }
}