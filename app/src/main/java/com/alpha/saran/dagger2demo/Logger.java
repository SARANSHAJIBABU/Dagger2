package com.alpha.saran.dagger2demo;

import android.util.Log;

/**
 * Created by saran on 14/8/16.
 */
public class Logger {
    private static int count=0;

    public Logger(){
        count++;
        Log.d("Dagger2","In Logger,Count = "+count);
    }
}
