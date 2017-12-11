package com.sample.sayan.zomato_android_sayan_sdk.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 09-12-2017.
 */

public class Collection {

    @SerializedName("collection")
    @Expose
    private Collection_ collection;

    public Collection_ getCollection() {
        return collection;
    }

    public void setCollection(Collection_ collection) {
        this.collection = collection;
    }
}
