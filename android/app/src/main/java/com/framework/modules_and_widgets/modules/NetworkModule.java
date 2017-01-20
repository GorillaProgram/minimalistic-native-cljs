package com.framework.modules_and_widgets.modules;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.framework.application.JobApplication;
import com.framework.vendors.http.jobs.NetworkJob;

import org.json.JSONObject;

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
    }

    @Override
    public String getName() {
        return "NetworkModule";
    }

    @ReactMethod
    public void addJob(String url, JSONObject params, Callback successCallback, Callback failureCallback) {
        JobApplication.getInstance().getJobManager().addJobInBackground(new NetworkJob(url, params, successCallback, failureCallback));
    }

}
