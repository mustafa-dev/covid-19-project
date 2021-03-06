package com.application.network

import com.application.model.CoronaCountriesInformation
import com.application.model.CoronaNewsInformation
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

/*
  Created by Muhammed Yusuf ÇİL
  19.04.2020 - 14:48    
  myusufcl7@gmail.com
*/

//https://api.collectapi.com/corona/countriesData

interface IApiService {
    @Headers("Authorization: apikey 2WNOzsNJx8ud5KbCBwwRA6:3yM1VFyR9Wn5kXLj7OQJW2")
    @GET("corona/countriesData/")
    fun getCoronaForCountries(): Call<CoronaCountriesInformation>

    @Headers("Authorization: apikey 2WNOzsNJx8ud5KbCBwwRA6:3yM1VFyR9Wn5kXLj7OQJW2")
    @GET("corona/coronaNews/")
    fun getCoronaNews(): Call<CoronaNewsInformation>

}