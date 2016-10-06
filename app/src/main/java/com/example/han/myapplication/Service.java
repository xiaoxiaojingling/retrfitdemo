package com.example.han.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hanhui on 2016/10/5.
 */
public interface Service {

    @GET("/")//网页的子目录
    Call<String> getBaiDu();

}
