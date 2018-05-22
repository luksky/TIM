package com.example.lgdu.tim.api.model;

import java.util.ArrayList;

public class ListObj {
    public int getCount() {
        return count;
    }

    private final int count;

    public ArrayList<Integer> getList() {
        return list;
    }

    private final ArrayList<Integer> list;
    public ListObj(int count, ArrayList list){
        this.count=count;
        this.list=list;
    }



}
