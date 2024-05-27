package com.example.testapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testapp.database.model.OfferEntity

@Database(entities = [OfferEntity::class], version = 1)
abstract class OfferDataBase : RoomDatabase() {


    companion object {
        private var database: OfferDataBase? = null
        val DB_NAME = "offer_db"
        fun getInstance(context: Context): OfferDataBase {
            synchronized(OfferDataBase::class.java)
            {
                 if (database == null) {
                    database = Room.databaseBuilder(context,OfferDataBase::class.java, DB_NAME).build()
                }

            }

            return database!!
        }

    }

    abstract fun offer_dao() : OfferDao

}