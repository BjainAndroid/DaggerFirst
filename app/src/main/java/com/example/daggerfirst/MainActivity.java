package com.example.daggerfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerfirst.component.DaggerMobileComponent;
import com.example.daggerfirst.component.MobileComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileComponent component = DaggerMobileComponent.create();
        component.inject(this);
        mobile.run();
    }
}