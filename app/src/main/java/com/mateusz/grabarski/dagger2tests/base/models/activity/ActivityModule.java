package com.mateusz.grabarski.dagger2tests.base.models.activity;

import com.mateusz.grabarski.dagger2tests.domain.models.DataGenerator;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
@Module
public class ActivityModule {

    @ActivityScope
    @Provides
    public DataGenerator provideDataGenerator() {
        return new DataGenerator();
    }
}
