package com.abt.basiclib.app;

import android.app.Application;

import com.abt.basiclib.BuildConfig;
import com.abt.basiclib.debug.DebugManage;

/**
 * @描述：     @BasicApplication
 * @作者：     @黄卫旗
 * @创建时间： @21/05/2018
 */
public abstract class BasicApplication extends Application {

    private static BasicApplication mContext;

    public static final BasicApplication getAppContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        init();
        initComplete();
    }

    private final void init() {
        if (BuildConfig.DEBUG) {
            DebugManage.initialize(this);
        }
    }

    public abstract void initComplete();

}
