package com.example.daggerfirst.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    private Battery battery;
    private Proccessor proccessor;

    @Inject
    public Mobile(Battery battery, Proccessor proccessor) {
        this.battery = battery;
        this.proccessor = proccessor;
        Log.i("MyMobile:","Mobile");
    }

    public void run(){
        proccessor.start();
        Log.i("MyMobile:","Mobile Run");
    }

    /*@Inject
    public void connectCharger(Charger charger){
        charger.setCharger(this);
    }*/
}
