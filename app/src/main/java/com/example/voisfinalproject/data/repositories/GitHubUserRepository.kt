package com.example.voisfinalproject.data.repositories

import com.example.voisfinalproject.data.models.GitHubResponse
import com.example.voisfinalproject.data.services.GitHubService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GitHubUserRepository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(GitHubService::class.java)

    suspend fun searchUsers(query: String, page: Int = 1): GitHubResponse {
        return service.searchUsers(query, 1)
    }
}