package com.framework.modules_and_widgets.modules;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.framework.utilities.NetworkUtility;

import org.greenrobot.eventbus.EventBus;

/**
 * package: com.framework.modules_and_widgets.modules
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/16 下午6:37
 * desc:
 */

public class NetworkModule extends ReactContextBaseJavaModule {

    public NetworkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        EventBus.getDefault().register(this);
    }

    @Override
    public String getName() {
        return "NetworkModule";
    }

    @ReactMethod
    public void addNetworkJob(String url, String paramsString, final Callback successCallback, final Callback failureCallback) {
        NetworkUtility.sendRequest(url, paramsString,
                response -> {
                    // TODO 组装成功返回数据
                    successCallback.invoke(response.toString());
                },
                error -> {
                    // TODO 组装失败返回数据
                    failureCallback.invoke(error.toString());
                }
        );
    }

}
