package com.alpha.saran.dagger2demo;

import android.app.Application;

/**
 * Created by saran on 13/8/16.
 */
public class MyApplication extends Application{
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder()
                .build();
    }

    public DiComponent getComponent() {
        return component;
    }

}
