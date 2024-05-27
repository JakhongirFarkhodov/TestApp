package com.example.testapp.apiServices.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class OfferResponse(
    @SerializedName("id")
    @Expose
    val id:Int,

    @SerializedName("name")
    @Expose
    val name:String,

    @SerializedName("brand")
    @Expose
    val brand:String,

    @SerializedName("category")
    @Expose
    val category:String,

    @SerializedName("merchant")
    @Expose
    val merchant:String,

    @SerializedName("attributes")
    @Expose
    val attributes:List<AttributeResponse>,

    @SerializedName("image")
    val image:ImageResponse
)
