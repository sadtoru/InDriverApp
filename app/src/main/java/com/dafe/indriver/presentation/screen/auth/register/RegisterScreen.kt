package com.dafe.indriver.presentation.screen.auth.register

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dafe.indriver.presentation.screen.auth.register.components.RegisterContent
import com.dafe.indriver.ui.theme.InDriverTheme

@Composable
fun RegisterScreen(navHostController: NavHostController) {
    Scaffold { paddingValues ->
        RegisterContent(navHostController, paddingValues)
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    InDriverTheme {
        RegisterScreen(rememberNavController())

    }
}