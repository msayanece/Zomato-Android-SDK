package com.sample.sayan.zomato_android_sayan_sdk.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 09-12-2017.
 */

public class Event {

    @SerializedName("event_id")
    @Expose
    private Integer eventId;
    @SerializedName("friendly_start_date")
    @Expose
    private String friendlyStartDate;
    @SerializedName("friendly_end_date")
    @Expose
    private String friendlyEndDate;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("restaurants")
    @Expose
    private List<Object> restaurants = null;
    @SerializedName("is_valid")
    @Expose
    private Integer isValid;
    @SerializedName("share_url")
    @Expose
    private String shareUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("display_time")
    @Expose
    private String displayTime;
    @SerializedName("display_date")
    @Expose
    private String displayDate;
    @SerializedName("is_end_time_set")
    @Expose
    private Integer isEndTimeSet;
    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;
    @SerializedName("event_category")
    @Expose
    private Integer eventCategory;
    @SerializedName("event_category_name")
    @Expose
    private String eventCategoryName;
    @SerializedName("book_link")
    @Expose
    private String bookLink;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getFriendlyStartDate() {
        return friendlyStartDate;
    }

    public void setFriendlyStartDate(String friendlyStartDate) {
        this.friendlyStartDate = friendlyStartDate;
    }

    public String getFriendlyEndDate() {
        return friendlyEndDate;
    }

    public void setFriendlyEndDate(String friendlyEndDate) {
        this.friendlyEndDate = friendlyEndDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Object> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Object> restaurants) {
        this.restaurants = restaurants;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(String displayTime) {
        this.displayTime = displayTime;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
    }

    public Integer getIsEndTimeSet() {
        return isEndTimeSet;
    }

    public void setIsEndTimeSet(Integer isEndTimeSet) {
        this.isEndTimeSet = isEndTimeSet;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Integer getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(Integer eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getEventCategoryName() {
        return eventCategoryName;
    }

    public void setEventCategoryName(String eventCategoryName) {
        this.eventCategoryName = eventCategoryName;
    }

    public String getBookLink() {
        return bookLink;
    }

    public void setBookLink(String bookLink) {
        this.bookLink = bookLink;
    }
}
