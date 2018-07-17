package com.mateusz.grabarski.dagger2tests;

import android.os.Bundle;
import android.util.Log;

import com.mateusz.grabarski.dagger2tests.base.BaseActivity;
import com.mateusz.grabarski.dagger2tests.base.models.activity.ActivityModule;
import com.mateusz.grabarski.dagger2tests.base.models.activity.DaggerActivityComponent;
import com.mateusz.grabarski.dagger2tests.base.models.subcomponents.main.MainActivityScope;
import com.mateusz.grabarski.dagger2tests.domain.models.DataGenerator;

import javax.inject.Inject;

@MainActivityScope
public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Inject
    DataGenerator dataGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder().activityModule(new ActivityModule()).build().mainActivityComponent().inject(this);

        Log.d(TAG, "onCreate: " + dataGenerator.toString());
    }
}
