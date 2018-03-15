package com.example.youness.westoleyoutube;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by SIMEA on 15/03/2018.
 */

public abstract class YoutubeRequest {
    private ArrayList<VideoYoutube> items;

    public ArrayList<VideoYoutube> getItems() {
        return items;
    }
}
