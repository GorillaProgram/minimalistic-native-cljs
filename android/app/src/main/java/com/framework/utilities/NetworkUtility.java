package com.framework.utilities;

import android.content.Context;

import com.framework.application.JobApplication;
import com.framework.vendors.http.network.NetworkResult;
import com.framework.vendors.http.request.JSONPostRequest;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * package: com.framework.utilities
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/17 上午8:46
 * desc:
 */

public class NetworkUtility {

    private static Context mContext;

    public static void init(Context context) {
        mContext = context;
    }

    public static void sendRequest(String url, String paramsString, NetworkResult networkResult) {
        try {
            JobApplication.getInstance()
                    .getRequestQueue()
                    .add(new JSONPostRequest(url, new JSONObject(paramsString), networkResult::onSuccess, networkResult::onFailure));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
