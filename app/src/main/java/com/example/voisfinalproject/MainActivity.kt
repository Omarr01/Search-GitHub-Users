package com.example.voisfinalproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.voisfinalproject.ui.screens.GitHubUserSearchScreen
import com.example.voisfinalproject.ui.theme.VOISFInalProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VOISFInalProjectTheme {
                GitHubUserSearchScreen()
            }
        }
    }
}
