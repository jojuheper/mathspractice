package com.example.demo.controller.operation.simple;

import com.example.demo.util.common.CustomMapper;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class DataWrapper {
    @SerializedName("Data")
    private List<CustomMapper> dataList;

    public DataWrapper() {
        dataList = new ArrayList<>();
    }

    public void addData(CustomMapper data) {
        dataList.add(data);
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
