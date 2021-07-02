package com.example.courses.models


import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("topic")
    val topic: List<Topic>,
    @SerializedName("courses")
    val courses: List<Course>
)

data class Topic(
    @SerializedName("duration")
    val duration: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("title")
    val title: String
)

data class Course(
    @SerializedName("title")
    val title: String,
    @SerializedName("precent")
    val precent: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("background_color_precent")
    val backgroundColorPrecent: String
)