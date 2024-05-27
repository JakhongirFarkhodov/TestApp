package com.example.testapp.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.testapp.apiServices.ApiServices
import com.example.testapp.apiServices.model.OfferResponse
import com.example.testapp.data.mapper.OfferMapper
import com.example.testapp.database.OfferDataBase
import com.example.testapp.domain.OfferRepository
import com.example.testapp.domain.model.Offer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OfferRepositoryImpl(
    private val dataBase: OfferDataBase,
    private val apiServices: ApiServices,
    private val mapper: OfferMapper = OfferMapper()
) :  OfferRepository{

    private val _offer_list = MutableLiveData<List<Offer>>()
    private val scope = CoroutineScope(Dispatchers.IO)

    val offer_list:LiveData<List<Offer>>
        get() = _offer_list



    override fun getListOfOffers() {
        scope.launch {
            var offerResponse = emptyList<OfferResponse>()
            try {
                offerResponse = apiServices.getOfferList().offers
            }
            catch (e:Exception)
            {
                Log.d("TAG", "getListOfOffers: Internet connection is not available")
            }

            dataBase.offer_dao().insertOffer(mapper.offerResponseToOfferEntity(offerResponse))
            val offer = mapper.offerEntityToOfferModel(dataBase.offer_dao().getAllOffer())
            _offer_list.postValue(offer)
        }

    }




}