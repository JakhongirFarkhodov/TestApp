package com.example.testapp.domain.model

data class Offer(
    val id:Int,
    val name:String,
    val brand:String,
    val category:String,
    val merchant:String,
//    val attributes:List<Attribute>,
    val image:String
)
