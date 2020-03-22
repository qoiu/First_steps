package com.example.first_steps;

import java.io.Serializable;

class Singleton implements Serializable {
    private static Singleton instance;
    private boolean settingNightMode;
    private boolean settingWnd;
    private boolean settingPressure;
    private boolean settingWaterTemp;
    private boolean settingInCelsius;


    private Singleton() {
    }

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void setSettingNightMode(boolean settingNightMode) {
        this.settingNightMode = settingNightMode;
    }

    void setSettingWnd(boolean settingWnd) {
        this.settingWnd = settingWnd;
    }

    void setSettingPressure(boolean settingPressure) {
        this.settingPressure = settingPressure;
    }

    void setSettingWaterTemp(boolean settingWaterTemp) {
        this.settingWaterTemp = settingWaterTemp;
    }

    void setSettingInCelsius(boolean settingInCels) {
        this.settingInCelsius = settingInCels;
    }

    boolean isSettingNightMode() {
        return settingNightMode;
    }

    boolean isSettingWnd() {
        return settingWnd;
    }

    boolean isSettingPressure() {
        return settingPressure;
    }

    boolean isSettingWaterTemp() {
        return settingWaterTemp;
    }

    boolean isSettingInCelsius() {
        return settingInCelsius;
    }
}
