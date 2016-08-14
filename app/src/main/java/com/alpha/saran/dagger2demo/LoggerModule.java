package com.alpha.saran.dagger2demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saran on 14/8/16.
 */
@Module
public class LoggerModule {

    @Provides @Singleton
    Logger providesLogger(){
        return new Logger();
    }
}
