package com.framework.pages.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.framework.base.UIActivity;
import com.framework.pages.widget.manager.ProgressBarDialogManager;
import com.minimalisticnativecljs.R;

/**
 * package: com.framework.pages.activity
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/13 上午11:31
 * desc:
 */

public class TestActivity extends UIActivity {

    private TextView mTextView;
    private String mParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        initData();
        initViews();
        setupViews();
    }

    private void initData() {
        mParams = getIntent().getStringExtra("params");
    }

    private void initViews() {
        mTextView = (TextView) findViewById(R.id.textView);

        ProgressBarDialogManager.showProgressBar();
    }

    private void setupViews() {
        mTextView.setText(mParams);
    }

}
