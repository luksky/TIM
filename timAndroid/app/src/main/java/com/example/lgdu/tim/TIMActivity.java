package com.example.lgdu.tim;

import android.content.Context;
import android.os.StrictMode;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lgdu.tim.api.avgService;
import com.example.lgdu.tim.api.listService;
import com.example.lgdu.tim.api.model.AsyncTIMActivityAvg;
import com.example.lgdu.tim.api.model.AsyncTIMActivityGetList;
import com.example.lgdu.tim.api.model.ListObj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TIMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tim);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.43.233:8080/").addConverterFactory(GsonConverterFactory.create())
                .build();
        final ListView returnList = findViewById(R.id.resultList);
        final TextInputEditText inputCount=findViewById(R.id.inputCount);

        final listService listService = retrofit.create(listService.class);
        final avgService avgService= retrofit.create(avgService.class);
        final Button buttonGetList = findViewById(R.id.buttonList);
        final Button buttonGetAvg = findViewById(R.id.buttonAvg);
        final TextView avgResult=findViewById(R.id.avgResult);
        final Context context=this;


        final ArrayList<Integer> itemList=new ArrayList();
        buttonGetList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AsyncTIMActivityGetList asyncTIMActivityGetList = new AsyncTIMActivityGetList(listService, returnList, inputCount,context, itemList);
                asyncTIMActivityGetList.execute();


            }
        });
        buttonGetAvg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AsyncTIMActivityAvg asyncTIMActivityAvg= new AsyncTIMActivityAvg(avgService ,  returnList, listService, itemList,  avgResult);
                asyncTIMActivityAvg.execute();

            }
        });


    }
}
