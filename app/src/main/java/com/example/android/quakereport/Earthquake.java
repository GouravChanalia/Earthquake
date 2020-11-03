package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mTime;

    public Earthquake(double mMagnitude, String mLocation, String mTime) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTime = mTime;
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

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getmTime() {
        return mTime;
    }
}
