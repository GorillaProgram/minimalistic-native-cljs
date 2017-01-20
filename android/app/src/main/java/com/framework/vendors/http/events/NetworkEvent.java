package com.framework.vendors.http.events;

import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * package: com.framework.vendors.http.events
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 2017/1/20 下午12:56
 * desc:
 */

public class NetworkEvent {

    private String responseType;
    private JSONObject response;
    private VolleyError error;

    public NetworkEvent(String responseType, JSONObject response) {
        this.responseType = responseType;
        this.response = response;
    }

    public NetworkEvent(String responseType, VolleyError error) {
        this.responseType = responseType;
        this.error = error;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public JSONObject getResponse() {
        return response;
    }

    public void setResponse(JSONObject response) {
        this.response = response;
    }

    public VolleyError getError() {
        return error;
    }

    public void setError(VolleyError error) {
        this.error = error;
    }
}
