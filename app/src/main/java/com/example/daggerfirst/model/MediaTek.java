package com.example.daggerfirst.model;

import android.util.Log;

import javax.inject.Inject;

public class MediaTek implements Proccessor{

    int clockSpeed;
    @Inject
    public MediaTek(int clockSpeed) {
        Log.i("MyMobile", "MediaTek: ");
    }

    @Override
    public void start() {
        Log.i("MyMobile", "MediaTek start: ");
    }
}
