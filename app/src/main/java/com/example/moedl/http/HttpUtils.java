package com.example.moedl.http;

public class HttpUtils {
    //单例模式
    public static final HttpUtils ourInstance = new HttpUtils();

    private HttpUtils() {

    }

    public static HttpUtils getInstance(){
        return ourInstance;
    }

}
