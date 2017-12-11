package com.sample.sayan.zomato_android_sayan_sdk.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 09-12-2017.
 */

public class Photo {

    @SerializedName("photo")
    @Expose
    private Photo_ photo;

    public Photo_ getPhoto() {
        return photo;
    }

    public void setPhoto(Photo_ photo) {
        this.photo = photo;
    }
}
