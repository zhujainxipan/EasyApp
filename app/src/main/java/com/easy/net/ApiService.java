package com.easy.net;


import com.easy.model.Gank;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * author miekoz on 2016/3/17.
 * email  meikoz@126.com
 */
public interface ApiService {


    @GET("data/Android/{size}/{page}")
    Call<Gank> getMainAndroid(
            @Path("size") int size,
            @Path("page") int page
    );

}
