package com.yogify.matrialyouwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yogify.matrialyou.MatrialYou;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fun_showDatePicker(View view) {
        MatrialYou.ShowMatrialDatePicker(getApplicationContext(), getSupportFragmentManager());

    }

    public void fun_showDateRangePicker(View view) {
        MatrialYou.MatirialARangPicker(getApplicationContext(), getSupportFragmentManager());

    }
}