package com.example.first_steps;

import android.widget.Toast;

import java.io.Serializable;

public class Singletone implements Serializable {
    private static Singletone instance;
    private boolean settingNightMode;
    private boolean settingWnd;
    private boolean settingPressure;
    private boolean settingWaterTemp;
    private boolean settingInCels;

    private Singletone() {
    }

    static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }

    public void setSettingNightMode(boolean settingNightMode) {
        this.settingNightMode = settingNightMode;
    }

    public void setSettingWnd(boolean settingWnd) {
        this.settingWnd = settingWnd;
    }

    public void setSettingPressure(boolean settingPressure) {
        this.settingPressure = settingPressure;
    }

    public void setSettingWaterTemp(boolean settingWaterTemp) {
        this.settingWaterTemp = settingWaterTemp;
    }

    public void setSettingInCels(boolean settingInCels) {
        this.settingInCels = settingInCels;
    }

    public boolean isSettingNightMode() {
        return settingNightMode;
    }

    public boolean isSettingWnd() {
        return settingWnd;
    }

    public boolean isSettingPressure() {
        return settingPressure;
    }

    public boolean isSettingWaterTemp() {
        return settingWaterTemp;
    }

    public boolean isSettingInCels() {
        return settingInCels;
    }
}
