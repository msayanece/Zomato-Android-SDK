package com.sample.sayan.zomato_android_sayan_sdk.interfaces;


import com.sample.sayan.zomato_android_sayan_sdk.responses.CategoryResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.CuisinesResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.DailyMenuOfRestaurantResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.DetailRestaurantInfoResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.NearByGeocodeResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.RestaurantCollectionsResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.RestaurantEstablishmentsResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.RestaurantReviewsResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.SearchCitiesResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.SearchResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.ZomatoLocationDetailsResponse;
import com.sample.sayan.zomato_android_sayan_sdk.responses.ZomatoLocationsResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Admin on 20-10-2017.
 */

public interface Service {

    ///////////////////////***********************Common*****************************//////////////////////////
    /**
     * Get a list of categories. List of all restaurants categorized
     * under a particular restaurant type can be obtained using /Search
     * API with Category ID as inputs
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/categories")
    Call<CategoryResponse> getAllCategories();

    /**
     * Find the Zomato ID and other details for a city . You
     * can obtain the Zomato City ID in one of the following ways:
     * City Name in the Search Query - Returns list of cities matching the query
     * Using coordinates - Identifies the city details based
     * on the coordinates of any location inside a city
     * If you already know the Zomato City ID, this API
     * can be used to get other details of the city.
     *
     * @param queryParameters the following parameters can be send for search...
     *                1) key = q, value = query by city name
     *                2) key = lat, value = latitude
     *                3) key = lon, value = longitude
     *                4) key = city_ids, value = comma separated city_id values
     *                5) key = count, value = number of max results to display
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/cities")
    Call<SearchCitiesResponse> searchCities(@QueryMap Map<String, String> queryParameters);

    /**
     * Returns Zomato Restaurant Collections in a City.
     * The location/City input can be provided in the following ways -
     * Using Zomato City ID
     * Using coordinates of any location within a city
     * List of all restaurants listed in any particular
     * Zomato Collection can be obtained using the '/search'
     * API with Collection ID and Zomato City ID as the input
     *
     * @param cityId Mandatory parameter use city id got from cities query or direct
     * @param otherQueryParameters the following parameters can be send for search...
     *                1) key = lat, value = latitude
     *                2) key = lon, value = longitude
     *                3) key = count, value = number of max results to display
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/collections")
    Call<RestaurantCollectionsResponse> getRestaurantCollectionsByCityId(@Query("city_id") String cityId, @QueryMap Map<String, String> otherQueryParameters);

    /**
     * Get a list of all cuisines of restaurants listed in a city.
     * The location/city input can be provided in the following ways -
     * Using Zomato City ID
     * Using coordinates of any location within a city
     * List of all restaurants serving a particular cuisine can be obtained using '/search' API with cuisine ID and location details
     *
     * @param cityId Mandatory parameter id of the city for which cuisines are needed
     *               use city id got from cities query or direct
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/cuisines")
    Call<CuisinesResponse> getcuisinesByCityId(@Query("city_id") String cityId);

    /**
     * Get a list of all cuisines of restaurants listed in a city.
     * The location/city input can be provided in the following ways -
     * Using Zomato City ID
     * Using coordinates of any location within a city
     * List of all restaurants serving a particular cuisine can be obtained using '/search' API with cuisine ID and location details
     *
     * @param latitude latitude / longitude of any point within a city
     *
     * @param longitude latitude / longitude of any point within a city
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/cuisines")
    Call<CuisinesResponse> getcuisinesByLatLon(@Query("lat") String latitude, @Query("lon") String longitude);

    /**
     * Get a list of restaurant types in a city. The location/City
     * input can be provided in the following ways -
     * Using Zomato City ID
     * Using coordinates of any location within a city
     * List of all restaurants categorized under a particular
     * restaurant type can obtained using /Search API with
     * Establishment ID and location details as inputs
     *
     * @param cityId Mandatory parameter id of the city for which cuisines are needed
     *               use city id got from cities query or direct
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/establishments")
    Call<RestaurantEstablishmentsResponse> getRestaurantEstablishmentsByCityId(@Query("city_id") String cityId);


    /**
     * Get a list of restaurant types in a city. The location/City
     * input can be provided in the following ways -
     * Using Zomato City ID
     * Using coordinates of any location within a city
     * List of all restaurants categorized under a particular
     * restaurant type can obtained using /Search API with
     * Establishment ID and location details as inputs
     *
     * @param latitude latitude / longitude of any point within a city
     *
     * @param longitude latitude / longitude of any point within a city
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/establishments")
    Call<RestaurantEstablishmentsResponse> getRestaurantEstablishmentsByLatLon(@Query("lat") String latitude, @Query("lon") String longitude);

    /**
     * Get Foodie and Nightlife Index, list of popular cuisines and nearby restaurants around the given coordinates
     *
     * @param latitude latitude / longitude of any point within a city
     *
     * @param longitude latitude / longitude of any point within a city
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/geocode")
    Call<NearByGeocodeResponse> nearByGeocodeByLatLon(@Query("lat") String latitude, @Query("lon") String longitude);




    ////////////////////////****************Location*******************////////////////////////////
    /**
     * Search for Zomato locations by keyword. Provide coordinates to get better search results
     *
     * @param queryParameters the following parameters can be send for search...
     *                1) key = query, value = suggestion for location name
     *                2) key = lat, value = latitude
     *                3) key = lon, value = longitude
     *                4) key = count, value = max number of results to fetch
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/locations")
    Call<ZomatoLocationsResponse> searchForZomatoLocations(@QueryMap Map<String, String> queryParameters);


    /**
     * Get Foodie Index, Nightlife Index, Top Cuisines and Best rated restaurants in a given location
     *
     * @param entityId location id obtained from locations api
     *
     * @param entityType location type obtained from locations api
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/location_details")
    Call<ZomatoLocationDetailsResponse> getZomatoLocationDetails(@Query("entity_id") String entityId, @Query("entity_type") String entityType);


    ////////////////////////****************Restaurant*******************////////////////////////////

    /**
     * Get daily menu using Zomato restaurant ID.
     *
     * @param resId id of restaurant whose details are requested
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/dailymenu")
    Call<DailyMenuOfRestaurantResponse> getDailyMenuOfRestaurant(@Query("res_id") String resId);


 /**
     * Get detailed restaurant information using Zomato restaurant ID.
     * Partner Access is required to access photos and reviews.
     *
     * @param resId id of restaurant whose details are requested
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/restaurant")
    Call<DetailRestaurantInfoResponse> getDetailRestaurantInfo(@Query("res_id") String resId);

    /**
     * Get restaurant reviews using the Zomato restaurant ID.
     * Only 5 latest reviews are available under the Basic API plan.
     *
     * @param resId id of restaurant whose details are requested
     *
     * @param start fetch results after this offset
     *
     * @param count max number of results to retrieve
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/reviews")
    Call<RestaurantReviewsResponse> getRestaurantReviews(@Query("res_id") String resId, @Query("start") String start, @Query("count") String count);


    /**
     * The location input can be specified using Zomato location ID or coordinates.
     * Cuisine / Establishment / Collection IDs can be obtained from respective api calls.
     * Get up to 100 restaurants by changing the 'start' and 'count' parameters
     * with the maximum value of count being 20. Partner Access is required to access photos and reviews.
     * Examples:
     * To search for 'Italian' restaurants in 'Manhattan, New York City',
     * set cuisines = 55, entity_id = 94741 and entity_type = zone
     * To search for 'cafes' in 'Manhattan, New York City',
     * set establishment_type = 1, entity_type = zone and entity_id = 94741
     * Get list of all restaurants in 'Trending this Week' collection in 'New York City' by using
     * entity_id = 280, entity_type = city and collection_id = 1
     *
     * Example Request:
     *  https://developers.zomato.com/api/v2.1/search?entity_id=1&entity_type=city&q=kol&start=0&count=5&lat=22.63&lon=88.43&radius=5000&cuisines=2&establishment_type=4&collection_id=3&category=1&sort=real_distance&order=asc
     * @param queryParameters the following parameters can be send for search...
     *
     *                1) entity_id, value = location id
     *                2) entity_type, value = location type
     *                3) q, value = search keyword
     *                4) count, value = fetch results after offset
     *                4) count = count, value = max number of results to display
     *                4) lat = count, value = latitude
     *                4) lon = count, value = longitude
     *                4) radius = count, value = radius around (lat,lon); to define search area, defined in meters(M)
     *                4) cuisines = count, value = list of cuisine id's separated by comma
     *                4) establishment_type = estblishment id obtained from establishments call
     *                4) collection_id = count, value = collection id obtained from collections call
     *                4) category = count, value = category ids obtained from categories call
     *                4) sort = count, value = sort restaurants by ... (cost, rating, real_distance)
     *                4) order = count, value = used with 'sort' parameter to define ascending / descending (asc, desc)
     *
     * @return the request {@link Call}
     */
    @GET("/api/v2.1/search")
    Call<SearchResponse> search(@QueryMap Map<String, String> queryParameters);

}
