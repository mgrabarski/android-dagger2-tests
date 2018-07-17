package com.mateusz.grabarski.dagger2tests;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mateusz.grabarski.dagger2tests.base.App;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplicationContext()).getApplicationComponent().inject(this);

        Log.d(TAG, "onCreate: " + preferences.toString());
    }
}
