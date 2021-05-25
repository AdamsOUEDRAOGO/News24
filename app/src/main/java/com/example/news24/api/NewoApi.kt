package com.example.news24.api

import android.telecom.Call
import retrofit.call
import retrofit2.http.GET




interface NewoApi {
    @GET("value: pokemon")
    fun getNewsList : Call<NewsResponse>
}