package com.framework.pages.widget.manager;

import android.content.Context;

import com.framework.pages.widget.ProgressBarDialog;

/**
 * package: com.framework.pages.widget
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/19 上午8:30
 * desc:
 */

public class ProgressBarDialogManager {

    private static Context mContext;

    private static ProgressBarDialog mProgressBarDialog;

    public static void init(Context context) {
        mContext = context;

        mProgressBarDialog = new ProgressBarDialog.Builder(context).build();
    }

    /**
     * 显示 ProgressBar
     */
    public static void showProgressBar() {
        mProgressBarDialog.show();
    }

    /**
     * 显示 ProgressBar (带文字)
     */
    public static void showProgressBar(String message) {
        mProgressBarDialog
                .setMessage(message)
                .show();
    }

    /**
     * 关闭 ProgressBar
     */
    public static void dismissProgressBar() {
        mProgressBarDialog.dismiss();
    }

}
