package com.mateusz.grabarski.dagger2tests;

import android.os.Bundle;
import android.util.Log;

import com.mateusz.grabarski.dagger2tests.base.App;
import com.mateusz.grabarski.dagger2tests.base.BaseActivity;
import com.mateusz.grabarski.dagger2tests.base.models.activity.ActivityScope;
import com.mateusz.grabarski.dagger2tests.domain.models.DataGenerator;

import javax.inject.Inject;

@ActivityScope
public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Inject
    DataGenerator dataGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplicationContext()).getActivityComponent().inject(this);

        Log.d(TAG, "onCreate: " + dataGenerator.generateString());
    }
}
