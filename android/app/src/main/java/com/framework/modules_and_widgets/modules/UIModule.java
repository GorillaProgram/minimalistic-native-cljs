package com.framework.modules_and_widgets.modules;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * package: com.framework.modules_and_widgets.modules
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/18 上午11:50
 * desc:
 */

public class UIModule extends ReactContextBaseJavaModule {

    public UIModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "UIModule";
    }

    @ReactMethod
    public void showLoading(String message) {

    }

    @ReactMethod
    public void showSuccess(String message, Callback positiveAction) {

    }

    @ReactMethod
    public void showSuccess(String message, Callback positiveAction, Callback negativeAction) {

    }
    @ReactMethod
    public void showMessage(String message, Callback positiveAction) {

    }

    @ReactMethod
    public void showMessage(String message, Callback positiveAction, Callback negativeAction) {

    }

    @ReactMethod
    public void showFailure(String message, Callback positiveAction) {

    }

    @ReactMethod
    public void showFailure(String message, Callback positiveAction, Callback negativeAction) {

    }

}
