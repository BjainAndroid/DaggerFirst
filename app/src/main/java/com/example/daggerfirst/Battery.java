package com.example.daggerfirst;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("MyMobile:","Battery");
    }
}