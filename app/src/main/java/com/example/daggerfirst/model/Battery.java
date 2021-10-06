package com.example.daggerfirst.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("MyMobile:","Battery");
    }
}
