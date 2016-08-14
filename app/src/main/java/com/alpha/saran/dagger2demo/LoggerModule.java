package com.alpha.saran.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saran on 14/8/16.
 */
@Module
public class LoggerModule {

    @Provides
    Logger providesLogger(){
        return new Logger();
    }
}
