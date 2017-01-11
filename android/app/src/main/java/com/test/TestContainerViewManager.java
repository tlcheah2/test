package com.test;

import android.widget.FrameLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

/**
 * Created by tekloon on 10/01/2017.
 */

public class TestContainerViewManager extends ViewGroupManager<FrameLayout> {

    private static final String TAG = "TestContainerView";

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    protected FrameLayout createViewInstance(ThemedReactContext reactContext) {
        return new TestContainerView(reactContext);
    }

}
