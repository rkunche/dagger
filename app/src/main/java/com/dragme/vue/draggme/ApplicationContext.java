package com.dragme.vue.draggme;

import android.app.Application;

import com.dragme.vue.draggme.dragger.components.DaggerPrefComponent;
import com.dragme.vue.draggme.dragger.components.PrefComponent;


public class ApplicationContext extends Application{
    PrefComponent prefComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initRetrofitComponent();
    }

    public PrefComponent initRetrofitComponent() {
        return DaggerPrefComponent.builder()
                .build();
    }
}
