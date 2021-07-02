package com.example.courses.api

import com.example.courses.models.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api_response")
    suspend fun getApiResponse(): Response<ApiResponse>
}