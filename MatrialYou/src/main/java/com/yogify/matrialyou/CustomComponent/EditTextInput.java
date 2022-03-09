package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputLayout;
import com.yogify.matrialyou.R;

public class EditTextInput extends com.google.android.material.textfield.TextInputLayout {

    public EditTextInput(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setHelperTextTextAppearance(R.style.EditTextStyleOutline);
        this.setPadding(15, 0, 15, 0);

    }

}
