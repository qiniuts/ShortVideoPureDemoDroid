package com.qiniu.shortvideo.app;

import android.app.Application;

import com.qiniu.pili.droid.shortvideo.PLShortVideoEnv;
import com.qiniu.shortvideo.app.utils.Config;

public class ShortVideoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PLShortVideoEnv.init(getApplicationContext());
        Config.init(getApplicationContext());
    }
}
