package com.framework.pages.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.framework.pages.widget.ProgressBarDialog;
import com.minimalisticnativecljs.R;

/**
 * package: com.framework.pages.activity
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/13 上午11:31
 * desc:
 */

public class TestActivity extends Activity {

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

        new ProgressBarDialog.Builder(this)
//                .setMessage("这个就是自定义的提示框")
                .create()
                .show();
    }

    private void setupViews() {
        mTextView.setText(mParams);
    }

}
