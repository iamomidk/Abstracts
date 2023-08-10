package com.polygon.abstracts.api

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class BaseApiPresenter<T>(
    private val apiService: ApiService,
    private val errorHandler: ApiErrorHandler,
    private val responseHandler: ApiResponseHandler<T>
) {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun makeApiCall(apiCall: suspend () -> Response<T>) {
        coroutineScope.launch {
            try {
                val response = apiCall.invoke()

                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        responseHandler.handleResponse(responseBody)
                    } else {
                        responseHandler.handleFailure("Response body is null")
                    }
                } else {
                    val errorMessage = errorHandler.handleApiError(response.code())
                    responseHandler.handleError(errorMessage)
                }
            } catch (e: Exception) {
                responseHandler.handleError("An error occurred: ${e.message}")
            }
        }
    }
}
