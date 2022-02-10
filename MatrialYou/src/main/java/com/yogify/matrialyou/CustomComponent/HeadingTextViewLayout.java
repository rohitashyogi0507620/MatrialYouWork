package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.yogify.matrialyou.R;

public class HeadingTextViewLayout extends com.google.android.material.textfield.TextInputLayout {


    public HeadingTextViewLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(15, 20, 15, 0);
        this.setLayoutParams(lp);

    }


}
