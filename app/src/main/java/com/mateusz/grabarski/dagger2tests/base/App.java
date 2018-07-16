package com.mateusz.grabarski.dagger2tests.base;

import android.app.Application;

import com.mateusz.grabarski.dagger2tests.base.di.ApplicationComponent;
import com.mateusz.grabarski.dagger2tests.base.di.ApplicationModule;
import com.mateusz.grabarski.dagger2tests.base.di.DaggerApplicationComponent;

/**
 * Created by Mateusz Grabarski on 16.07.2018.
 */
public class App extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    private ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
