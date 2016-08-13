package com.alpha.saran.dagger2demo;

/**
 * Created by saran on 13/8/16.
 */
public class NetworkApi {

    public boolean validateUser(String user, String password){
        if(user==null || user.length()==0|| password == null||password.length()==0){
            return false;
        }
        return true;
    }
}
