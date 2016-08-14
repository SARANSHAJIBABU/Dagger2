package com.alpha.saran.dagger2demo;

import android.util.Log;

/**
 * Created by saran on 13/8/16.
 */
public class NetworkClient {

    public NetworkClient(Logger logger){
        if(logger!=null){
            Log.d("Dagger2","Logger created");
        }
    }

    public void connect(){
        Log.d("Dagger2","Connected");
    }
}
