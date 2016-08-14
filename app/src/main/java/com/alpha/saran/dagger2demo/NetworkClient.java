package com.alpha.saran.dagger2demo;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by saran on 13/8/16.
 */

@Singleton
public class NetworkClient {
    private static int count=0;

    @Inject
    public NetworkClient(Logger logger){
        if(logger!=null){
            Log.d("Dagger2","Logger created");
        }
        count++;
        Log.d("Dagger2","In NetworkClient,Count = "+count);
    }

    public void connect(){
        Log.d("Dagger2","Connected");
    }
}
