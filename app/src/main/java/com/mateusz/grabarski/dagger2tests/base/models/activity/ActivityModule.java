package com.mateusz.grabarski.dagger2tests.base.models.activity;

import com.mateusz.grabarski.dagger2tests.base.models.subcomponents.main.MainActivityScope;
import com.mateusz.grabarski.dagger2tests.domain.models.DataGenerator;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
@Module
public class ActivityModule {

    @MainActivityScope
    @Provides
    public DataGenerator provideDataGenerator() {
        return new DataGenerator();
    }
}
