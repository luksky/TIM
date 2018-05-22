package com.example.lgdu.tim.api;

import com.example.lgdu.tim.api.model.AvgObj;
import com.example.lgdu.tim.api.model.ListObj;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface avgService {
    @GET("/AVG")
    Call<AvgObj> listRepos(@Query("list") ArrayList<Integer> list);
}
