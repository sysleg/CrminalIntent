package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Dmitry on 18.04.2017.
 */

public class Crime {
    private UUID mId;
    private Date mDate;
    private boolean mSolved;
    private String mTitle;
    private String mSuspect;

    public String getSuspect() {
        return mSuspect;
    }
    public void setSuspect(String mSuspect) {
        this.mSuspect = mSuspect;
    }
    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
    public Date getDate() {
        return mDate;
    }
    public void setDate(Date mDate) {
        this.mDate = mDate;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime()
    {
        this(UUID.randomUUID());
    }

    public Crime(UUID uuid) {
        mId = uuid;
        mDate = new Date();
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }
}
