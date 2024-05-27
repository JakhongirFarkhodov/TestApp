package com.example.testapp.data.mapper

import com.example.testapp.apiServices.model.OfferResponse
import com.example.testapp.database.model.OfferEntity
import com.example.testapp.domain.model.Attribute
import com.example.testapp.domain.model.Offer

class OfferMapper {

    fun offerResponseToOfferEntity(list: List<OfferResponse>):List<OfferEntity> = list.map {
        OfferEntity(
            id = it.id,
            name = it.name,
            brand = it.brand,
            category = it.category,
            merchant = it.merchant,
            image = it.image.url
        )
    }

    fun offerEntityToOfferModel(list: List<OfferEntity>):List<Offer> = list.map {
        Offer(
            id = it.id,
            name = it.name,
            brand = it.brand,
            category = it.category,
            merchant = it.merchant,
            image = it.image
        )
    }



}