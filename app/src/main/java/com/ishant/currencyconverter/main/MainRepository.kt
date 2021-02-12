package com.ishant.currencyconverter.main

import com.ishant.currencyconverter.data.models.CurrencyResponse
import com.ishant.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}