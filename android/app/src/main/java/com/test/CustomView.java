package com.test;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by tekloon on 10/01/2017.
 */

public class CustomView extends LinearLayout {

    private TextView mText;

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
        mText = (TextView) findViewById(R.id.text1);
    }

    public void setPositionText(int position) {
        mText.setText("Page " + position);
    }
}
