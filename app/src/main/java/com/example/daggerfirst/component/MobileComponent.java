package com.example.daggerfirst.component;

import com.example.daggerfirst.MainActivity;
import com.example.daggerfirst.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {
    Mobile getMobile();

    void inject(MainActivity activity);
}
