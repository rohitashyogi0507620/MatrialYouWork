package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.text.InputType;
import android.util.AttributeSet;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.yogify.matrialyou.R;

public class EmailEditText extends androidx.appcompat.widget.AppCompatEditText {

    public EmailEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTextAppearance(context, R.style.EditTextStyleNormal);
        this.setInputType(InputType.TYPE_CLASS_TEXT);

    }

}
