package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private Long mTime;
    private String mURL;

    public Earthquake(double mMagnitude, String mLocation, Long mTime,String mURL) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
        this.mURL=mURL;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmTime(Long mTime) {
        this.mTime = mTime;
    }

    public Long getmTime() {
        return mTime;
    }

    public void setmURL(String mURL) {
        this.mURL = mURL;
    }

    public String getmURL() {
        return mURL;
    }
}
