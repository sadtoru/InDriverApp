package com.dafe.indriver.presentation.screen.auth.login


import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.dafe.indriver.presentation.screen.auth.login.components.LoginContent

@Composable
fun LoginScreen(navHostController: NavHostController) {

    Scaffold { paddingValues ->
        LoginContent(navHostController, paddingValues)
    }
}