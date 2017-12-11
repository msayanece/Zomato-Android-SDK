package com.sample.sayan.zomato_android_sayan_sdk.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sample.sayan.zomato_android_sayan_sdk.models.Establishment;

import java.util.List;

/**
 * Created by Admin on 09-12-2017.
 */

public class RestaurantEstablishmentsResponse {

    @SerializedName("establishments")
    @Expose
    private List<Establishment> establishments = null;

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }
}
