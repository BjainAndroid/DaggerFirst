package com.example.daggerfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerfirst.component.DaggerMobileComponent;
import com.example.daggerfirst.component.MobileComponent;
import com.example.daggerfirst.model.Mobile;
import com.example.daggerfirst.modules.SnapdragonModule;

import javax.inject.Inject;

import dagger.internal.DaggerGenerated;

public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileComponent component = DaggerMobileComponent.builder()
                .snapdragonModule(new SnapdragonModule(3))
                .build();
        component.inject(this);
        mobile.run();
    }
}