package com.example.daggerfirst.modules;

import com.example.daggerfirst.model.MediaTek;
import com.example.daggerfirst.model.Proccessor;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModules {

    @Binds
     abstract Proccessor getProcessor(MediaTek mediaTek);
}

