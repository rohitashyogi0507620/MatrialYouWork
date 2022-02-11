package com.yogify.matrialyouwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.yogify.matrialyou.CustomComponent.PieChart;
import com.yogify.matrialyou.MatrialYou;


public class MainActivity extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChart = findViewById(R.id.piechart);
        if (pieChart.isButtonActive()){
            pieChart.setText("Hello Button is Active");
        }else {
            pieChart.setText("Hello Button is not Active");

        }

    }

    public void fun_showDatePicker(View view) {
        MatrialYou.ShowMatrialDatePicker(getApplicationContext(), getSupportFragmentManager());

    }

    public void fun_showDateRangePicker(View view) {
        MatrialYou.MatirialARangPicker(getApplicationContext(), getSupportFragmentManager());

    }

    public void fun_startmodule(View view) {
       pieChart.setButtonActive(true);
    }

    public void fun_startcomponentActivity(View view) {
        MatrialYou.StartComponentActivity(getApplicationContext());
    }
}