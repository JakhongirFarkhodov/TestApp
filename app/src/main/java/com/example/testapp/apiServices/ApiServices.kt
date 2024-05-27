package com.example.testapp.apiServices

import com.example.testapp.apiServices.model.OfferResponse
import com.example.testapp.apiServices.model.Offers
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {

    @GET("hh/test/api/v1/offers")
    suspend fun getOfferList():Offers

}