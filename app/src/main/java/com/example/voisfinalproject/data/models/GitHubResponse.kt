package com.example.voisfinalproject.data.models

data class GitHubResponse(
    val total_count: Int,
    val incomplete_results: Boolean,
    val items: List<GitHubUser>
)