package com.example.youness.westoleyoutube;

/**
 * Created by youness on 16/02/2018.
 */

public class VideoYoutube {
    private VideoId id;
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
