package com.sample.sayan.zomato_android_sayan_sdk.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 09-12-2017.
 */

public class Establishment {

    @SerializedName("establishment")
    @Expose
    private Establishment_ establishment;

    public Establishment_ getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment_ establishment) {
        this.establishment = establishment;
    }
}
