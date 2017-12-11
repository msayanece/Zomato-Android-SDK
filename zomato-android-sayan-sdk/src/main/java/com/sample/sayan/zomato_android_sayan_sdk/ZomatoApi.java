package com.sample.sayan.zomato_android_sayan_sdk;

import android.content.Context;

import com.sample.sayan.zomato_android_sayan_sdk.interfaces.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admin on 20-10-2017.
 */

public class ZomatoApi {
    private final Retrofit retrofit;

    private ZomatoApi(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    /**
     * Builder for {@link ZomatoApi}
     */
    public static class Builder {
        SessionConfig session;

        Builder(SessionConfig session) {
            this.session = session;
        }

        /**
         * Create the {@link ZomatoApi} to be used.
         *
         * @return {@link ZomatoApi}
         */
        public ZomatoApi build(Context context) {
            if (InterceptorHTTPClientCreator.getOkHttpClient() == null) {
                return null;
            } else {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(context.getResources().getString(R.string.zomato_base_url))
                        .client(InterceptorHTTPClientCreator.getOkHttpClient())
                        .build();
                return new ZomatoApi(retrofit);
            }
        }
    }

    /**
     * Starts a {@link Builder} with a {@link SessionConfig} to create Ola Services.
     *
     * @param session required {@link SessionConfig}
     */
    public static Builder with(SessionConfig session) {
        return new Builder(session);
    }

    /**
     * Get the {@link Service} to use with the Ola API.
     * Consumers should cache and reuse this object.
     *
     * @return {@link Service}
     */
    public Service createService() {
        return retrofit.create(Service.class);
    }
}
