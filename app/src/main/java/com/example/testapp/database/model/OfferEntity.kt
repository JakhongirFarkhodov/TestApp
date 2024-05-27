package com.example.testapp.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.testapp.domain.model.Attribute

@Entity(tableName = "offer_table")
data class OfferEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id:Int,

    @ColumnInfo(name = "name")
    val name:String,

    @ColumnInfo(name = "brand")
    val brand:String,

    @ColumnInfo(name = "category")
    val category:String,

    @ColumnInfo(name = "merchant")
    val merchant:String,

    @ColumnInfo("image")
    val image:String
)