package com.alpha.saran.dagger2demo;

/**
 * Created by saran on 13/8/16.
 */
public class NetworkApi {
    NetworkClient mClient;

    public NetworkApi(NetworkClient client){
        mClient = client;
    }

    public boolean validateUser(String user, String password){
        mClient.connect();
        if(user==null || user.length()==0|| password == null||password.length()==0){
            return false;
        }
        return true;
    }
}
