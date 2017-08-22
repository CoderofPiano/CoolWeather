package com.archermind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by archermind on 17-8-16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
