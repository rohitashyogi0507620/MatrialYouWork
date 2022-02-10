package com.yogify.matrialyou.CustomComponent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.yogify.matrialyou.R;

public class HeadingTextView extends androidx.appcompat.widget.AppCompatTextView {

    public HeadingTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTextAppearance(context, R.style.TextStyleTopHeading);
    }

    public HeadingTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


    }
}
