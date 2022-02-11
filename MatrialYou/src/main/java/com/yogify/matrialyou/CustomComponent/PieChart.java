package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.yogify.matrialyou.R;

public class PieChart extends com.google.android.material.button.MaterialButton {

    boolean mShowText;
    int textPos;

    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.PieChart, 0, 0);

        try {
            mShowText = a.getBoolean(R.styleable.PieChart_showText, false);
            textPos = a.getInteger(R.styleable.PieChart_labelPosition, 0);
            setButtonActive(mShowText);
        } finally {
            a.recycle();
        }
    }


    public boolean isButtonActive() {
        return mShowText;
    }

    public void setButtonActive(boolean isactive) {
        mShowText = isactive;
        if (mShowText) {
            this.setActivated(true);
            this.setTextColor(Color.RED);
            this.setBackgroundColor(Color.BLACK);
        }else {
            this.setActivated(true);
            this.setTextColor(Color.WHITE);
            this.setBackgroundColor(Color.GRAY);
        }
        invalidate();
        requestLayout();
    }
}
