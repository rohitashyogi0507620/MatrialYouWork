package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.InputType;
import android.util.AttributeSet;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputLayout;
import com.yogify.matrialyou.R;

public class EmailEditText extends androidx.appcompat.widget.AppCompatEditText {

    public EmailEditText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setTextAppearance(context,R.style.EditTextStyleNormal);
    }



}
