package com.yogify.matrialyou;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.yogify.matrialyou.CustomComponent.HeadingTextView;

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
        datePicker.addOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialogInterface) {
                Toast.makeText(context, "This Is Dynamic Bro", Toast.LENGTH_SHORT).show();
            }
        });
        datePicker.addOnNegativeButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "This Is Dynamic Bro", Toast.LENGTH_SHORT).show();

            }
        });

    }

    static public void MatirialARangPicker(Context context, FragmentManager fragmentManager) {
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

    static public void StartComponentActivity(Context context) {
        Intent intent = new Intent(context, ComponentActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    static public  int GetHeadingStyle() {
      return R.style.TextStyleTopHeading;
    }


}
