package com.example.testapp.apiServices

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiResponse {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.kattabozor.uz/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiServices = retrofit.create(ApiServices::class.java)

}