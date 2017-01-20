package com.framework.application;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.framework.initialize.DataInitialized;
import com.framework.modules_and_widgets.register.RegisterPackages;
import com.framework.utilities.NotificationUtility;
import com.minimalisticnativecljs.BuildConfig;
import com.squareup.leakcanary.LeakCanary;

import java.util.Arrays;
import java.util.List;

/**
 * package: com.framework.application
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/20 上午8:35
 * desc:
 */

public abstract class BaseApplication extends Application implements ReactApplication, DataInitialized {

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {

        @Override
        protected boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.asList(
                    new MainReactPackage(),
                    new RegisterPackages()
            );
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initialize();
    }

    @Override
    public void initialize() {
        initReact();
        initLeakCanary();
        initManagers();
        initUtilities();
    }

    private void initReact() {
        SoLoader.init(this, /* native exopackage */ false);
    }

    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    private void initManagers() {

    }

    private void initUtilities() {
        // 初始化 Notification 工具类
        NotificationUtility.init(this);
    }

}
