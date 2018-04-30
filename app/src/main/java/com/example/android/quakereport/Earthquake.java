package com.example.android.quakereport;

/**
 * Created by ramonsl on 29/04/2018.
 */

public class Earthquake {

    private double mMagnitude;


    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

      public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setTimeInMilliseconds(long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
