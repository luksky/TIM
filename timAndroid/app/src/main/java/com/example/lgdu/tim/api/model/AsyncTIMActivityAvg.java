package com.example.lgdu.tim.api.model;

import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lgdu.tim.api.avgService;
import com.example.lgdu.tim.api.listService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class AsyncTIMActivityAvg extends AsyncTask<Void, Void, String> {
    public AsyncTIMActivityAvg(avgService service, ListView returnList, listService listService,ArrayList<Integer> itemList, TextView avgResult) {
        this.service = service;
        this.returnList = returnList;
        this.listService=listService;
        this.itemList=itemList;
        this.avgResult=avgResult;
    }


    avgService service;
    ListView returnList;
    listService listService;
    ArrayList<Integer> itemList;
    TextView avgResult;

    @Override
    protected String doInBackground(Void... voids) {

        Call<AvgObj> avgObjCall = service.listRepos(itemList);
        AvgObj body = null;
        try {
            Response<AvgObj> execute = avgObjCall.execute();
            body = execute.body();
            return body.getAvg();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        avgResult.setText(s);
        super.onPostExecute(s);
    }
}
