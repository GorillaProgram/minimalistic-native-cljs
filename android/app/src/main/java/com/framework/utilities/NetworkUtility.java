package com.framework.utilities;

import android.content.Context;

import com.framework.application.JobApplication;
import com.framework.vendors.http.network.NetworkResult;
import com.framework.vendors.http.request.JSONRequest;
import com.squareup.phrase.Phrase;

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
            System.out.println(Phrase.from("=== {url} == {params} ====>>>>> ").put("url", url).put("params", paramsString).format());
            JSONObject params = new JSONObject(paramsString);
            JobApplication.getInstance()
                    .getRequestQueue()
                    .add(new JSONRequest(url, "{}".equals(params.toString()) ? null : params,
                            response -> {
                                System.out.println(Phrase.from("=== {url} == {response} ====>>>>> ").put("url", url).put("response", response.toString()).format());
                                networkResult.onSuccess(response);
                            },
                            error -> {
                                System.out.println(Phrase.from("=== {url} == {error} ====>>>>> ").put("url", url).put("error", error.toString()).format());
                                networkResult.onFailure(error);
                            }));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
