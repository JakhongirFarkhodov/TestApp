package com.example.testapp.domain

import androidx.lifecycle.LiveData
import com.example.testapp.domain.model.Offer

interface OfferRepository {

    fun getListOfOffers()

}