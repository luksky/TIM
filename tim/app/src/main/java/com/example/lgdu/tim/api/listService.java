package com.example.lgdu.tim.api;

import com.example.lgdu.tim.api.model.ListObj;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface listService {
    @GET("/Random")
    Call<ListObj> listRepos(@Query("count") String count);



}
