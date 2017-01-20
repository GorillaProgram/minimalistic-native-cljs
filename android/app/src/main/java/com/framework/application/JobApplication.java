package com.framework.application;

import android.util.Log;

import com.framework.initialize.DataInitialized;
import com.framework.utilities.NotificationUtility;
import com.path.android.jobqueue.JobManager;
import com.path.android.jobqueue.config.Configuration;
import com.path.android.jobqueue.log.CustomLogger;
import com.squareup.leakcanary.LeakCanary;

/**
 * package: com.framework.application
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/20 上午10:08
 * desc:
 */

public abstract class JobApplication extends RNApplication implements DataInitialized {

    private static JobApplication instance;

    public static JobApplication getInstance() {
        return instance;
    }

    /* Android Priority Job Queue 相关 start */
    private volatile JobManager jobManager;
    public synchronized JobManager getJobManager() {
        if (null == jobManager) {
            synchronized (JobManager.class) {
                if (null == jobManager) {
                    jobManager = configureJobManager();
                }
            }
        }
        return jobManager;
    }

    private JobManager configureJobManager() {
        Configuration.Builder builder = new Configuration.Builder(this)
                .customLogger(new CustomLogger() {
                    private static final String TAG = "MeePwn JOB";

                    @Override
                    public boolean isDebugEnabled() {
                        return true;
                    }

                    @Override
                    public void d(String text, Object... args) {
                        Log.d(TAG, String.format(text, args));
                    }

                    @Override
                    public void e(Throwable t, String text, Object... args) {
                        Log.e(TAG, String.format(text, args), t);
                    }

                    @Override
                    public void e(String text, Object... args) {
                        Log.e(TAG, String.format(text, args));
                    }
                })
                .minConsumerCount(1)//always keep at least one consumer alive
                .maxConsumerCount(3)//up to 3 consumers at a time
                .loadFactor(3)//3 jobs per consumer
                .consumerKeepAlive(120);//wait 2 minute
        return new JobManager(this, builder.build());
    }
    /* Android Priority Job Queue 相关 end */

    @Override
    public void onCreate() {
        super.onCreate();

        initialize();
    }

    @Override
    public void initialize() {

        initData();
        initManagers();
        initUtilities();
        initLeakCanary();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        instance = this;
    }

    /**
     * 初始化内存泄漏检测工具
     */
    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    /**
     * 初始化全局管理类
     */
    private void initManagers() {

    }

    /**
     * 初始化全局工具类
     */
    private void initUtilities() {
        // 初始化 Notification 工具类
        NotificationUtility.init(this);
    }

}