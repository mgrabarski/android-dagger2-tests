package com.mateusz.grabarski.dagger2tests.base.models.activity;

import com.mateusz.grabarski.dagger2tests.MainActivity;

import dagger.Component;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
@ActivityScope
@Component(modules = {
        ActivityModule.class
})
public interface ActivityComponent {
    void inject(MainActivity target);
}
