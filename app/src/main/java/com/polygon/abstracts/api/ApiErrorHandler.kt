package com.polygon.abstracts.api

interface ApiErrorHandler {
    fun handleApiError(errorCode: Int): String
}
