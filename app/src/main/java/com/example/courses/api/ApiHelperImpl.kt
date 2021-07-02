package com.example.courses.api

import com.example.courses.models.ApiResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getApiResponse(): Response<ApiResponse> = apiService.getApiResponse()
}