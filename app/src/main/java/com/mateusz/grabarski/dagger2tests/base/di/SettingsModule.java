package com.mateusz.grabarski.dagger2tests.base.di;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
@Module
public class SettingsModule {

    @Inject
    Context mContext;

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("file_name", Context.MODE_PRIVATE);
    }
}
