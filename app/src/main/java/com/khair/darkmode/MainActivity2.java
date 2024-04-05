package com.khair.darkmode;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.khair.darkmode.thui.Darkmode;

public class MainActivity2 extends Darkmode {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


       new AlertDialog.Builder(MainActivity2.this )
               .setTitle("abulkhair")
               .show();




    }
}