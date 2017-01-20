package com.framework.utilities;

import com.framework.vendors.http.NetworkResult;

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

    public static void sendRequest(String url, JSONObject params, NetworkResult networkResult) {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("url", url);
        networkResult.onSuccess(new JSONObject(responseMap));
    }

}
