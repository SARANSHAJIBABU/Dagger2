package com.alpha.saran.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by saran on 13/8/16.
 */

@Singleton
@Component(modules = {NetworkApiModule.class,
                        LoggerModule.class})

public interface DiComponent {
    void inject(MainActivity activity);
}
