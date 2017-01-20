package com.framework.utilities;

import com.framework.vendors.http.NetworkResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * package: com.framework.utilities
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/17 上午8:46
 * desc:
 */

public class NetworkUtility {

    public static void sendRequest(String url, String paramsString, NetworkResult networkResult) {
        try {
            JSONObject params = new JSONObject(paramsString);
            Map responseMap = new HashMap<>();
            responseMap.put("url", url);
            responseMap.put("data", params);
            networkResult.onSuccess(new JSONObject(responseMap));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
