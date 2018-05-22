package com.example.lgdu.tim.api.model;

import android.content.Context;
import android.os.AsyncTask;
import android.support.design.widget.TextInputEditText;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lgdu.tim.api.listService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class AsyncTIMActivityGetList extends AsyncTask<Void, Void, List> {
    private listService service;
    private ListView returnList;
    TextInputEditText inputCount;
    Context context;
    ArrayList<Integer> itemList;

    public AsyncTIMActivityGetList(listService service, ListView returnList, TextInputEditText inputCount, Context context, ArrayList<Integer> itemList) {
        this.service = service;
        this.returnList = returnList;
        this.inputCount = inputCount;
        this.context=context;
        this.itemList=itemList;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected ArrayList doInBackground(Void... voids) {
        Call<ListObj> avgObjCall = service.listRepos(inputCount.getText().toString());
        ListObj body = null;
        try {
            Response<ListObj> execute = avgObjCall.execute();
            body = execute.body();
            itemList.clear();
            itemList.addAll(body.getList());
            return itemList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(List s) {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, s);
        returnList.setAdapter(adapter);
        super.onPostExecute(s);
    }

}
