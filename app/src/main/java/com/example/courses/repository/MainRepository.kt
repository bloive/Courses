package com.example.courses.repository

import com.example.courses.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getApiResponse() = apiHelper.getApiResponse()
}