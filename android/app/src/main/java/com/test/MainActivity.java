package com.test;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactRootView;

public class MainActivity extends ReactActivity {

    private ReactRootView mReactRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mReactRootView = new ReactRootView(this);
//        mReactRootView.setBackgroundColor(Color.RED);

//        mReactRootView.startReactApplication(getReactInstanceManager(), "test", null);

//        setContentView(mReactRootView);
    }


//    public void changeActivity(){
//        mReactRootView.add
//    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */


    @Override
    protected String getMainComponentName() {
        return "test";
    }
}
