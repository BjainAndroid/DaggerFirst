package com.example.daggerfirst;

import android.util.Log;

import javax.inject.Inject;

public class Proccessor {

    @Inject
    public Proccessor() {
        Log.i("MyMobile:","Processor");
    }
}