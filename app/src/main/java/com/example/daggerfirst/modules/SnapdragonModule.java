package com.example.daggerfirst.modules;

import com.example.daggerfirst.model.Proccessor;
import com.example.daggerfirst.model.Snapdragon;

import dagger.Module;
import dagger.Provides;


@Module
public class SnapdragonModule {

    int clockSpeed;

    public SnapdragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
        Proccessor getProccessor(){
            return new Snapdragon(clockSpeed);
        }


        @Provides
        int getClockSpeed(){
        return clockSpeed;
        }
        @Provides
    Proccessor getprocessor(Snapdragon snapdragon){
        return snapdragon;
        }
    }
