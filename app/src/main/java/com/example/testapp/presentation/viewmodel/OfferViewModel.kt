package com.example.testapp.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.testapp.apiServices.ApiResponse
import com.example.testapp.data.repository.OfferRepositoryImpl
import com.example.testapp.database.OfferDataBase
import com.example.testapp.domain.model.Offer
import com.example.testapp.domain.usecase.GetListOfOfferUseCase

class OfferViewModel(
    context: Context
) : ViewModel() {

    private val dataBase = OfferDataBase.getInstance(context)
    private val apiServices = ApiResponse().apiServices
    private val repository = OfferRepositoryImpl(dataBase, apiServices)
    private val getListOfOfferUseCase = GetListOfOfferUseCase(repository)
    private var isLoaded = false

    val offer:LiveData<List<Offer>>
        get() = repository.offer_list


    fun getOfferData(){
        if (!isLoaded) {
            getListOfOfferUseCase.invoke()
            isLoaded = true
        }
    }


}