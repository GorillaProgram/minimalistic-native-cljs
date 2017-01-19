package com.minimalisticnativecljs.pages;

import com.framework.base.UIActivity;
import com.framework.pages.widget.manager.ProgressBarDialogManager;

public class MainActivity extends UIActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "MinimalisticNativeCljs";
    }

    @Override
    public void setContentView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initViews() {

    }

    @Override
    public void setupViews() {
        ProgressBarDialogManager.showProgressBar("正在加载中!!!!");
    }

}
