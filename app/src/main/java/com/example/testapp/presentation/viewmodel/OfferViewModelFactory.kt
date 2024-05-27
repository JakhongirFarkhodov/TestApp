package com.example.testapp.presentation.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class OfferViewModelFactory(val context: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  if (modelClass.isAssignableFrom(OfferViewModel::class.java))
        {
            OfferViewModel(context) as T
        }
        else{
            throw RuntimeException("Cannot found ${modelClass.name}")
        }
    }
}