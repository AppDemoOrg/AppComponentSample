package com.abt.basiclib.debug;

import android.app.Application;
import android.os.StrictMode;

/**
 * @描述：     @Debug管理器
 * @作者：     @黄卫旗
 * @创建时间： @21/05/2018
 */
public final class DebugManage {

    /**
     * 初始化
     * @param application
     */
    public static final void initialize(Application application) {
        initLeakCanary(application);
        initStrictMode();
    }

    /** 初始化内存检查 */
    private static final void initLeakCanary(Application application) {
        // TODO
        /*if (LeakCanary.isInAnalyzerProcess(application)) {
            return;
        }
        LeakCanary.install(application);*/
    }

    /** 配置严格模式 */
    private static final void initStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build());
    }

}
