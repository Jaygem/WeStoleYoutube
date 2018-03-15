package com.example.youness.westoleyoutube;

/**
 * Created by youness on 23/02/2018.
 */

public class VideoSnippet {
    private String publishedAt;
    private String title;
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
