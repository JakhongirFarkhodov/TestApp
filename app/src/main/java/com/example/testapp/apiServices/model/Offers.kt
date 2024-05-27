package com.example.testapp.apiServices.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Offers (

    @SerializedName("offers")
    @Expose
    val offers:List<OfferResponse>

)