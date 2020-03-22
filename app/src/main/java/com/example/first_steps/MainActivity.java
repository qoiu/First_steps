package com.example.first_steps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Switch swNight;
    private Switch swPressure;
    private Switch swWind;
    private Switch swWaterTemp;
    private RadioButton rbCelsius;
    private RadioButton rbFahrenheit;
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        Log.d(TAG, "Start");
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        setupElements();
    }

    private void setupElements() {
        swNight = findViewById(R.id.switchNightMode);
        swPressure = findViewById(R.id.switchPressure);
        swWind = findViewById(R.id.switchWind);
        swWaterTemp = findViewById(R.id.switchWaterTemp);
        rbCelsius = findViewById(R.id.radioBtnCels);
        rbFahrenheit = findViewById(R.id.radioBtnFahr);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Stop");
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        setElements();
    }

    private void setElements() {
        swNight.setChecked(Singleton.getInstance().isSettingNightMode());
        swWind.setChecked(Singleton.getInstance().isSettingWnd());
        swPressure.setChecked(Singleton.getInstance().isSettingPressure());
        swWaterTemp.setChecked(Singleton.getInstance().isSettingWaterTemp());
        rbCelsius.setChecked(Singleton.getInstance().isSettingInCelsius());
        rbFahrenheit.setChecked(!Singleton.getInstance().isSettingInCelsius());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        saveElementsState();
    }

    private void saveElementsState() {
        Singleton.getInstance().setSettingNightMode(swNight.isChecked());
        Singleton.getInstance().setSettingPressure(swPressure.isChecked());
        Singleton.getInstance().setSettingWnd(swWind.isChecked());
        Singleton.getInstance().setSettingWaterTemp(swWaterTemp.isChecked());
        Singleton.getInstance().setSettingInCelsius(rbCelsius.isChecked());
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroy");
        Toast.makeText(getApplicationContext(), "onDertroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Resume");
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Restart");
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
    }
}