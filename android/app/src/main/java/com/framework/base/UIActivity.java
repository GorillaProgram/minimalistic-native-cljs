package com.framework.base;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.framework.initialize.UIInitialized;
import com.framework.manager.DialogManager;
import com.framework.manager.ProgressBarDialogManager;
import com.framework.manager.NotificationCenterManager;

/**
 * package: com.framework.base
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/19 上午8:55
 * desc:
 */

public abstract class UIActivity extends ReactActivity implements UIInitialized {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView();
        super.onCreate(savedInstanceState);

        initialize();
        initData();
        initViews();
        setupViews();
    }

    @Override
    public void initialize() {

        // 初始化 Notification 管理类
        NotificationCenterManager.init(this);
        // 初始化 Dialog 管理类
        DialogManager.init(this);
        // 初始化 ProgressBarDialog 管理类
        ProgressBarDialogManager.init(this);

    }

}
