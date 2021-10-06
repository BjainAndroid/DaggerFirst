package com.example.daggerfirst.model;

import android.util.Log;

import javax.inject.Inject;

public class Proccessor {

    @Inject
    public Proccessor() {
        Log.i("MyMobile:","Processor");
    }
}
