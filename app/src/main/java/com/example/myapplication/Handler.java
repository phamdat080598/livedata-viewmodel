package com.example.myapplication;

import com.example.myapplication.viewmode.DataViewMode;

public class Handler {


    public void btnTang(DataViewMode dataMode){
        dataMode.getDiem().setValue(dataMode.getDiem().getValue()+1);
    }

    public void btnGiam(DataViewMode dataMode){
        dataMode.getDiem().setValue(dataMode.getDiem().getValue()-1);
    }
}
