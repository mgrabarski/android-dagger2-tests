package com.mateusz.grabarski.dagger2tests.base.di;

import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mateusz Grabarski on 16.07.2018.
 */
@Module
public class ApplicationModule {

    private Context mContext;

    public ApplicationModule(Context context) {
        this.mContext = context;
    }

    @Singleton
    @Provides
    public Context provideApplicationContext() {
        return mContext;
    }

    @Provides
    public Resources provideResources(Context context) {
        return context.getResources();
    }
}
