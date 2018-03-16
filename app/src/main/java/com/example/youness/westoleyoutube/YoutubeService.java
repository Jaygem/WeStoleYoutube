package com.example.youness.westoleyoutube;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by youness on 16/02/2018.
 */

public interface    YoutubeService {
    public static final String Base = "https://www.googleapis.com/youtube/v3/";
    public static final String key = "AIzaSyCXBz1_gDwtINXPED9BMN6As3RUg5uU5z0&";
    @GET("search?")
    Call<YoutubeRequest> getVideos(@Query("key") String key,
                                    @Query("q") String keyWords,
                                    @Query("part") String part,
                                    @Query("maxResults") int maxVideos
    );
}
