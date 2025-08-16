package com.example

import androidx.compose.runtime.Composable
import com.example.login.LoginScreen
import com.example.theme.NoteMarkTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    NoteMarkTheme {
        LoginScreen()
    }
}