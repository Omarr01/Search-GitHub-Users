package com.example.voisfinalproject.data.services

import com.example.voisfinalproject.data.models.GitHubResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {
    @GET("search/users")
    suspend fun searchUsers(
        @Query("q") query: String,
        @Query("page") page: Int = 1
    ): GitHubResponse
}