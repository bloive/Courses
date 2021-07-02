package com.example.courses.api

import com.example.courses.models.ApiResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun getApiResponse(): Response<ApiResponse>
}