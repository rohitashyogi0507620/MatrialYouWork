package com.yogify.matrialyou;

import android.content.Context;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class MatrialYou {

   static public void ShowMatrialDatePicker(Context context, FragmentManager fragmentManager) {
        MaterialDatePicker datePicker =
                MaterialDatePicker.Builder.datePicker()
                        .setTitleText("Select date")
                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                        .build();

        datePicker.show(fragmentManager, "Hell dATA");
        datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                Toast.makeText(context, selection.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

  static  public void MatirialARangPicker(Context context, FragmentManager fragmentManager) {
        MaterialDatePicker dateRangePicker =
                MaterialDatePicker.Builder.dateRangePicker()
                        .setTitleText("Select dates")
                        .build();
        dateRangePicker.show(fragmentManager, "This");
        dateRangePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                Toast.makeText(context, selection.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
