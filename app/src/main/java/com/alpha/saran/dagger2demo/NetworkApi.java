package com.alpha.saran.dagger2demo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by saran on 13/8/16.
 */
public class NetworkApi {
    NetworkClient mClient;
    private static int count=0;

    @Inject
    public NetworkApi(NetworkClient client){
        mClient = client;
        count++;
        Log.d("Dagger2","In NetworkApi,Count = "+count);
    }

    public boolean validateUser(String user, String password){
        mClient.connect();
        if(user==null || user.length()==0|| password == null||password.length()==0){
            return false;
        }
        return true;
    }
}
