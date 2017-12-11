package com.sample.sayan.zomato_android_sayan_sdk.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sample.sayan.zomato_android_sayan_sdk.models.DailyMenu;

import java.util.List;

/**
 * Created by Admin on 09-12-2017.
 */

public class DailyMenuOfRestaurantResponse {

    @SerializedName("daily_menu")
    @Expose
    private List<DailyMenu> dailyMenu = null;

    public List<DailyMenu> getDailyMenu() {
        return dailyMenu;
    }

    public void setDailyMenu(List<DailyMenu> dailyMenu) {
        this.dailyMenu = dailyMenu;
    }

}
