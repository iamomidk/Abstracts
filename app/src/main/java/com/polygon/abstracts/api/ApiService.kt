package com.polygon.abstracts.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("data") // Replace with your actual API endpoint
    suspend fun getData(): Response<MyData> // Replace MyData with your response data class
}
