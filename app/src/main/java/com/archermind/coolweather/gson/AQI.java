package com.archermind.coolweather.gson;

/**
 * Created by archermind on 17-8-16.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
