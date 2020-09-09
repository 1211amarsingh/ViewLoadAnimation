package com.customviews;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;

import androidx.core.content.ContextCompat;

import com.example.transactiondemo.R;


/**
 * Created by Vishnu Gupta mobile +91-8107357227 on 21/12/19.
 */
public class GradientTextView extends TypefaceTextView {


    public GradientTextView(Context context) {
        super(context);
    }

    public GradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GradientTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        //Setting the gradient if layout is changed
        if (changed) {
            getPaint().setShader(new LinearGradient(0, 0, getWidth(), getHeight(),
                    ContextCompat.getColor(getContext(), R.color.colorStart),
                    ContextCompat.getColor(getContext(), R.color.ColorCenter),

                    Shader.TileMode.CLAMP));
        }
    }

}
