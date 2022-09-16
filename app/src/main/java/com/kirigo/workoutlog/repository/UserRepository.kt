package com.kirigo.workoutlog.repository

class UserRepository {
    var apiClient = ApiClient.buildApiClient(ApiInterface::class.java)


    suspend fun loginUser(loginRequest: LoginRequest) = withContext(Dispatchers.IO){
        val  response = apiClient.login(loginRequest)
        return@withContext response
    }
}