package com.example.first_steps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        Log.d(TAG,"Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Resume");
        System.out.println("Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Restart");
    }
    private void setNightView(){

    }
}