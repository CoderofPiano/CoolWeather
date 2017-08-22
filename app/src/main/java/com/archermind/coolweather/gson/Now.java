package com.archermind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by archermind on 17-8-16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperarure;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;

    }
}
