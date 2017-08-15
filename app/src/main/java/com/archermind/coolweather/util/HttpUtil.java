package com.archermind.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by archermind on 17-8-9.
 */

public class HttpUtil {
    public static final String BASIS_ADRESS="http://guolin.tech/api/china";

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
