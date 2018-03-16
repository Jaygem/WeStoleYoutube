package com.example.youness.westoleyoutube;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by youness on 16/02/2018.
 */

public class VideoYoutube{
    @SerializedName("id")
    @Expose
    private VideoId id;
    @SerializedName("snippet")
    @Expose
    private VideoSnippet snippet;

    public String getTitle() {
        return snippet.getTitle();
    }
    public String getDate(){
        return snippet.getPublishedAt();
    }
    public String getDescription(){
        return snippet.getDescription();
    }
    public String getImageLink()
    {
        return snippet.getThumbnails().get_default().getUrl();
    }

    public int getImageHeight()
    {
        return snippet.getThumbnails().get_default().getHeight();
    }
    public int getImageWidth()
    {
        return snippet.getThumbnails().get_default().getWidth();
    }



}
