package com.framework.vendors.http.jobs;

import com.framework.constant.Constant;
import com.framework.utilities.NetworkUtility;
import com.framework.vendors.http.NetworkResult;
import com.framework.vendors.http.events.NetworkEvent;
import com.path.android.jobqueue.Job;
import com.path.android.jobqueue.Params;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/**
 * package: com.framework.vendors.http.jobs
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/20 上午10:20
 * desc:
 */

public class NetworkJob extends Job {

    private String mUrl;
    private String mParamsString;

    public NetworkJob(String url, String paramsString) {
        super(new Params(500).requireNetwork().persist().groupBy("network"));
        mUrl = url;
        mParamsString = paramsString;
    }

    @Override
    public void onAdded() {

    }

    @Override
    public void onRun() throws Throwable {
        NetworkUtility.sendRequest(mUrl, mParamsString, new NetworkResult() {
            @Override
            public void onSuccess(JSONObject response) {
                EventBus.getDefault().post(new NetworkEvent(Constant.RESPONSE_SUCCESS, response));
            }

            @Override
            public void onFailure(JSONObject response) {
                EventBus.getDefault().post(new NetworkEvent(Constant.RESPONSE_FAILURE, response));
            }
        });
    }

    @Override
    protected void onCancel() {

    }

    @Override
    protected boolean shouldReRunOnThrowable(Throwable throwable) {
        return false;
    }

}
