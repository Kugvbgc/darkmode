package com.khair.darkmode.thui;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.khair.darkmode.R;

public class Darkmode extends AppCompatActivity {

    boolean isNight;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
        isNight=sharedPreferences.getBoolean("NightMode",false);

        if (isNight){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }







    }
}
