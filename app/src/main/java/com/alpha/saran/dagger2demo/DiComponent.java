package com.alpha.saran.dagger2demo;

import dagger.Component;

/**
 * Created by saran on 13/8/16.
 */

@Component(modules = {NetworkApiModule.class})

public interface DiComponent {
    void inject(MainActivity activity);
}
