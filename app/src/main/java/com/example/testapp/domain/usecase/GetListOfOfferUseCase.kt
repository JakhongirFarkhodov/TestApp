package com.example.testapp.domain.usecase

import com.example.testapp.domain.OfferRepository

class GetListOfOfferUseCase(val repository: OfferRepository){

   operator fun invoke()
    {
        return repository.getListOfOffers()
    }

}