package com.polygon.abstracts.api

import retrofit2.HttpException
import java.io.IOException

class DefaultApiErrorHandler : ApiErrorHandler {
    private val errorMessages = mapOf(
        400 to "Bad Request",
        401 to "Unauthorized",
        403 to "Forbidden",
        404 to "Not Found",
        500 to "Internal Server Error",
        502 to "Bad Gateway",
        503 to "Service Unavailable",
        504 to "Gateway Timeout"
        // Add more error codes and messages as needed
    )

    override fun handleApiError(errorCode: Int): String {
        return errorMessages[errorCode] ?: "Unknown Error"
    }

    // Additional helper method to handle common exceptions
    fun handleException(exception: Exception): String {
        return when (exception) {
            is HttpException -> "HTTP Error: ${exception.code()}"
            is IOException -> "Network Error: ${exception.message}"
            else -> "An error occurred: ${exception.message}"
        }
    }
}
