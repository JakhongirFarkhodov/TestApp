package com.example.testapp.apiServices.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AttributeResponse(
    @SerializedName("name")
    @Expose
    val name:String,

    @SerializedName("value")
    val value:String
)
