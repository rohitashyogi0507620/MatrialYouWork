package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.widget.LinearLayout;

import com.yogify.matrialyou.R;

public class EditTextInput extends androidx.appcompat.widget.AppCompatEditText {


    public EditTextInput(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTextAppearance(context, R.style.EditTextStyle);

    }


}
