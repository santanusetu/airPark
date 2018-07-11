package com.visahackathon.airpark;

public class ParkingPlace {

    // Store the image
    private int mImageDrawable;

    // Store the details of the location
    private String mName;

    // Store the Address
    private String mAddress;

    // Store the Distance From
    private String mDistanceFrom;

    //predicted wait time
    private int waitTimeSeconds;

    // Constructor that is used to create an instance of the Parking Place object
    public ParkingPlace(int mImageDrawable, String mName, String mAddress, String mDistanceFrom, int waitTimeSeconds) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mDistanceFrom = mDistanceFrom;
        this.waitTimeSeconds = waitTimeSeconds;
    }


    //Image of location
    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    //name of location
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    //name of address
    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    //distance from destination
    public String getmDistanceFrom() {
        return mDistanceFrom;
    }

    public void setmDistanceFrom(String mDistanceFrom) {
        this.mDistanceFrom = mDistanceFrom;
    }

    //wait time of the parking
    public int getWaitTimeSeconds() {
        return waitTimeSeconds;
    }

    public void setWaitTimeSeconds(int waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
    }
}