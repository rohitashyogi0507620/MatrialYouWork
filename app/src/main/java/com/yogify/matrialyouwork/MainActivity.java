package com.yogify.matrialyouwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.yogify.matrialyou.MatrialYou;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Trying New Listing ", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "You Are New Bro", Toast.LENGTH_SHORT).show();
        int style = MatrialYou.GetRadioButtonStyle();
        RadioButton radioButton = findViewById(R.id.radio_male);
        radioButton.setTextAppearance(getApplicationContext(), style);


    }

    public void fun_showDatePicker(View view) {
        MatrialYou.ShowMatrialDatePicker(getApplicationContext(), getSupportFragmentManager());

    }

    public void fun_showDateRangePicker(View view) {
        MatrialYou.MatirialARangPicker(getApplicationContext(), getSupportFragmentManager());

    }

    public void fun_startmodule(View view) {

    }
}