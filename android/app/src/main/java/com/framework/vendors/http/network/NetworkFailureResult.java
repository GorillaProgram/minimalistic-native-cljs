package com.framework.vendors.http.network;

import com.android.volley.VolleyError;

/**
 * package: com.framework.vendors.http.network
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/22 上午10:32
 * desc:
 */

public interface NetworkFailureResult {

    public void onFailure(VolleyError error);

}
