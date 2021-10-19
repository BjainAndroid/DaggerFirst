package com.example.daggerfirst.modules;

import com.example.daggerfirst.model.Battery;
import com.example.daggerfirst.model.Cobalt;
import com.example.daggerfirst.model.Lithium;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BatteryModules {

    @Provides
    static Cobalt getCobalt(){
        return new Cobalt();
    }
    @Provides
    static Lithium getLithium(){
        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }
    @Provides
    static Battery getBattery(Lithium lithium,Cobalt cobalt){
        return new Battery(cobalt,lithium);
    }
    //
}
