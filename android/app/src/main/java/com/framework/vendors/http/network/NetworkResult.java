package com.framework.vendors.http.network;

import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * package: com.framework.vendors.http
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/20 上午11:01
 * desc:
 */

public interface NetworkResult {

    public void onSuccess(JSONObject response);
    public void onFailure(VolleyError error);

}
