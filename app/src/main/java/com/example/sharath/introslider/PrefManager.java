package com.example.sharath.introslider;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ProgressBar;

/**
 * Created by Sharath on 17-02-2018.
 */

public class PrefManager {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    //Shared preferences file name
    private static final String PREF_NAME = "Sharath-IntroSlider";

    //Shared preferece mode
    private static final int PRIVATE_MODE  = 0;

    //Key for the First Time Launch flag
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH,isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH,true);
    }
}
