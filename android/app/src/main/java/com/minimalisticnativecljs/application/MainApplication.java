package com.minimalisticnativecljs.application;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.framework.utilities.DialogUtility;
import com.framework.utilities.NotificationUtility;
import com.minimalisticnativecljs.BuildConfig;
import com.framework.modules_and_widgets.register.RegisterPackages;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

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

    private void initialize() {
        SoLoader.init(this, /* native exopackage */ false);

        // 初始化 Notification 工具类
        NotificationUtility.init(this);
        // 初始化 Dialog 工具类
        DialogUtility.init(this);

    }

}
