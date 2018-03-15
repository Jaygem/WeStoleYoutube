package com.example.youness.westoleyoutube;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by youness on 16/02/2018.
 */

public interface YoutubeService {
    public static final String Base = "https://www.googleapis.com/youtube/v3/";

    @GET("/search?key=AIzaSyCXBz1_gDwtINXPED9BMN6As3RUg5uU5z0")
    Call<VideoYoutube> getVideos(@Query("snippet") String snippet,
                                 @Query("q") String keyWords,
                                 @Query("part") String part,
                                 @Query("maxResults") int maxVideos);
}
