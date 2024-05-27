package com.example.testapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import com.example.testapp.database.model.OfferEntity

@Dao
interface OfferDao {

    @Upsert
    suspend fun insertOffer(list: List<OfferEntity>)

    @Query("Select * From offer_table")
    suspend fun getAllOffer():List<OfferEntity>

}