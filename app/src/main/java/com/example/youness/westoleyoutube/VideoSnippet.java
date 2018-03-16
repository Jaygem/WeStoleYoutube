package com.example.youness.westoleyoutube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by youness on 23/02/2018.
 */

public class VideoSnippet {
    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public VideoThumbnail getThumbnails() {
        return thumbnails;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    private VideoThumbnail thumbnails;
    private String channelTitle;
}
