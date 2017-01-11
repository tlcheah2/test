package com.test;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by tekloon on 10/01/2017.
 */

public class CustomView extends LinearLayout {
    public CustomView(Context context) {
        super(context);
        init(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.red_bg, this);
    }
}
