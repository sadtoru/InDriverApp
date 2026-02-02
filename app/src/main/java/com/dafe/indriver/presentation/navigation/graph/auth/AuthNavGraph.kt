package com.dafe.indriver.presentation.navigation.graph.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.dafe.indriver.presentation.navigation.Graph
import com.dafe.indriver.presentation.navigation.screen.auth.AuthScreen
import com.dafe.indriver.presentation.screen.auth.login.LoginScreen
import com.dafe.indriver.presentation.screen.auth.register.RegisterScreen


fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route,
    ) {
        composable(route = AuthScreen.Login.route) { LoginScreen(navController) }
        composable(route = AuthScreen.Register.route) { RegisterScreen(navController) }

    }
}