package com.example.daggerfirst.component;

import com.example.daggerfirst.MainActivity;
import com.example.daggerfirst.model.Mobile;
import com.example.daggerfirst.modules.BatteryModules;
import com.example.daggerfirst.modules.MediaTekModules;
import com.example.daggerfirst.modules.SnapdragonModule;

import dagger.Component;

@Component(modules = {BatteryModules.class, SnapdragonModule.class})
public interface MobileComponent {
//    Mobile getMobile();

    void inject(MainActivity activity);
}
