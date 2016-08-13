package com.alpha.saran.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saran on 13/8/16.
 */
@Module
public class NetworkApiModule {

    @Provides
    public NetworkApi provideNetworkApi(){
        return new NetworkApi();
    }
}
