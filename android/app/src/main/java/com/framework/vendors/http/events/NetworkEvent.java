package com.framework.vendors.http.events;

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

    private JSONObject response;
    private String responseType;

    public NetworkEvent(String responseType, JSONObject response) {
        this.responseType = responseType;
        this.response = response;
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

}
