package com.dicoding.restaurantreview.data.retrofit

import com.dicoding.restaurantreview.data.response.PostReviewResponse
import retrofit2.Call
import com.dicoding.restaurantreview.data.response.RestaurantResponse
import retrofit2.http.*


interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant( @Path("id") id:String ): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(@Field("id") id: String, @Field("name") name: String, @Field("review") review: String, ): Call<PostReviewResponse>

//    @Headers("Authorization: token 12345")
//    @DELETE("review/{id}")
//    fun deleteReview(@Path("id") id: String): Call<DeleteReviewResponse>

//    @Headers("Authorization: token 12345")
//    @PUT("review")
//    fun editReview(@Body editedReview: Dataclassnya ) : Call<EditReviewResponse>
}