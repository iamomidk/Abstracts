package com.polygon.abstracts.api

interface ApiResponseHandler<T> {
    fun handleResponse(response: T)
    fun handleFailure(error: String)
    fun handleError(error: String)
}
