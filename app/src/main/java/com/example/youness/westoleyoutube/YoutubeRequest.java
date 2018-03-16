package com.example.youness.westoleyoutube;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by SIMEA on 15/03/2018.
 */

public  class YoutubeRequest {
    @SerializedName("items")
    @Expose
    private ArrayList<VideoYoutube> items;

    public ArrayList<VideoYoutube> getItems() {
        return items;
    }
}
