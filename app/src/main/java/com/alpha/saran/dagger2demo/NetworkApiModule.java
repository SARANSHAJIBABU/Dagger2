package com.alpha.saran.dagger2demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saran on 13/8/16.
 */
@Module
public class NetworkApiModule {

    @Provides
    public NetworkClient provideNetworkClient(Logger logger){
        return new NetworkClient(logger);
    }

    @Provides
    public NetworkApi provideNetworkApi(NetworkClient client){
        return new NetworkApi(client);
    }


}
