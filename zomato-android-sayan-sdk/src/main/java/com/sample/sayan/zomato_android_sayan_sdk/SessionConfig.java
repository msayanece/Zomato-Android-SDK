package com.sample.sayan.zomato_android_sayan_sdk;


import android.content.Context;
import android.util.Log;

/**
 * Created by Admin on 20-10-2017.
 */

public class SessionConfig {

    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public static class Builder{
        private String apiKey;

        public Builder setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        @Deprecated
        public SessionConfig build() {
            return new SessionConfig(apiKey);
        }

        public SessionConfig build(Context context) {
            InterceptorHTTPClientCreator.createInterceptorHTTPClient(context, apiKey);
            return new SessionConfig(apiKey);
        }
    }

    private SessionConfig(String apiKey) {
        this.apiKey = apiKey;
        Log.d(Constants.TAG, "apiKey: " + apiKey);
    }
}
