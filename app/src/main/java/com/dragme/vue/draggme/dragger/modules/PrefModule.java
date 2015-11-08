package com.dragme.vue.draggme.dragger.modules;

import com.dragme.vue.draggme.utils.PrefUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class PrefModule {
    @Provides
    public PrefUtils providePrefUtils() {
        return new PrefUtils();
    }
}
