package com.mateusz.grabarski.dagger2tests.base.models.subcomponents.main;

import com.mateusz.grabarski.dagger2tests.MainActivity;
import com.mateusz.grabarski.dagger2tests.base.models.activity.ActivityModule;
import com.mateusz.grabarski.dagger2tests.domain.models.DataGenerator;

import dagger.Subcomponent;

/**
 * Created by Mateusz Grabarski on 17.07.2018.
 */
@MainActivityScope
@Subcomponent(modules = {
        ActivityModule.class
})
public interface MainActivityComponent {

    void inject(MainActivity target);

    DataGenerator dataGenerator();
}
