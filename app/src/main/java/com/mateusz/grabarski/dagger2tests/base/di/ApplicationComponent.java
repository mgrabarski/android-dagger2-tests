package com.mateusz.grabarski.dagger2tests.base.di;

import com.mateusz.grabarski.dagger2tests.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mateusz Grabarski on 16.07.2018.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        SettingsModule.class
})
public interface ApplicationComponent {

    void inject(BaseActivity target);
}
