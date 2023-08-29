package com.example.voisfinalproject.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.voisfinalproject.data.models.GitHubUser
import com.example.voisfinalproject.data.repositories.GitHubUserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class GitHubUserViewModel : ViewModel() {

    private val _users = MutableStateFlow<List<GitHubUser>>(emptyList())
    val users: StateFlow<List<GitHubUser>> = _users

    fun searchUsers(query: String) {
        viewModelScope.launch {
            val response = GitHubUserRepository.searchUsers(query, 1)
            _users.value = response.items
        }
    }
}
