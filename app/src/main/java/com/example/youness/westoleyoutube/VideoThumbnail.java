package com.example.youness.westoleyoutube;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by youness on 23/02/2018.
 */

public class VideoThumbnail {
    public VideoDefaultThumbnail get_default() {
        return _default;
    }

    @SerializedName("default")
    @Expose
    private VideoDefaultThumbnail _default;
}
