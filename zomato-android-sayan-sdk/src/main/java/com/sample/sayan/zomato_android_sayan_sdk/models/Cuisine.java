package com.sample.sayan.zomato_android_sayan_sdk.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 09-12-2017.
 */

public class Cuisine {

    @SerializedName("cuisine")
    @Expose
    private Cuisine_ cuisine;

    public Cuisine_ getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine_ cuisine) {
        this.cuisine = cuisine;
    }
}
