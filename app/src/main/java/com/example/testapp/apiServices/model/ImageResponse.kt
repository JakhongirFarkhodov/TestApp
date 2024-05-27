package com.example.testapp.apiServices.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ImageResponse(

    @SerializedName("url")
    @Expose
    val url:String

)
