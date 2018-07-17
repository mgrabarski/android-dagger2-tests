package com.mateusz.grabarski.dagger2tests.base;

import android.app.Application;

import com.mateusz.grabarski.dagger2tests.base.di.ApplicationComponent;
import com.mateusz.grabarski.dagger2tests.base.di.ApplicationModule;
import com.mateusz.grabarski.dagger2tests.base.di.DaggerApplicationComponent;
import com.mateusz.grabarski.dagger2tests.base.di.SettingsModule;
import com.mateusz.grabarski.dagger2tests.base.models.activity.ActivityComponent;
import com.mateusz.grabarski.dagger2tests.base.models.activity.ActivityModule;
import com.mateusz.grabarski.dagger2tests.base.models.activity.DaggerActivityComponent;

/**
 * Created by Mateusz Grabarski on 16.07.2018.
 */
public class App extends Application {

    private ApplicationComponent mApplicationComponent;
    private ActivityComponent mActivityComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .settingsModule(new SettingsModule())
                .build();

        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
