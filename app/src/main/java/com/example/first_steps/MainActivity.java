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
    Switch swNight;
    Switch swPressure;
    Switch swWind;
    Switch swWaterTemp;
    RadioButton rbCelsius;
    RadioButton rbFahrenheit;
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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
        swNight.setChecked(Singletone.getInstance().isSettingNightMode());
        swWind.setChecked(Singletone.getInstance().isSettingWnd());
        swPressure.setChecked(Singletone.getInstance().isSettingPressure());
        swWaterTemp.setChecked(Singletone.getInstance().isSettingWaterTemp());
        rbCelsius.setChecked(Singletone.getInstance().isSettingInCels());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        saveElementsState();
    }

    private void saveElementsState() {
        Singletone.getInstance().setSettingNightMode(swNight.isChecked());
        Singletone.getInstance().setSettingPressure(swPressure.isChecked());
        Singletone.getInstance().setSettingWnd(swWind.isChecked());
        Singletone.getInstance().setSettingWaterTemp(swWaterTemp.isChecked());
        Singletone.getInstance().setSettingInCels(rbCelsius.isChecked());
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