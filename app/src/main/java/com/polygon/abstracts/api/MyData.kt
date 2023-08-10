package com.polygon.abstracts.api

import com.google.gson.annotations.SerializedName

data class MyData(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    // Add more fields as needed
)
