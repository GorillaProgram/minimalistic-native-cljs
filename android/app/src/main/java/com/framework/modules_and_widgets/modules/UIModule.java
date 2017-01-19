package com.framework.modules_and_widgets.modules;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.framework.pages.widget.manager.ProgressBarDialogManager;

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
    public void showLoading() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                ProgressBarDialogManager.showProgressBar();
            }
        });
    }

    @ReactMethod
    public void showLoadingWithMessage(final String message) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                ProgressBarDialogManager.showProgressBar(message);
            }
        });
    }

    @ReactMethod
    public void showLoadingCouldCancelable(final boolean couldCancelable) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                ProgressBarDialogManager.showProgressBar(couldCancelable);
            }
        });
    }

    @ReactMethod
    public void showLoadingCouldCancelableWithMessage(final boolean couldCancelable, final String message) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                ProgressBarDialogManager.showProgressBar(couldCancelable, message);
            }
        });
    }

    @ReactMethod
    public void dismissLoading() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                ProgressBarDialogManager.dismissProgressBar();
            }
        });
    }

}
