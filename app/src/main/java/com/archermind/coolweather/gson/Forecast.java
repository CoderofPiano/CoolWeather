package com.archermind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by archermind on 17-8-16.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;
        public String min;
    }

}
