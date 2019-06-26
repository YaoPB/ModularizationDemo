package com.yaopb.modularizationdemo.app;

import android.app.Application;
import android.util.Log;

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("onCreate", "启动");
    }
}
