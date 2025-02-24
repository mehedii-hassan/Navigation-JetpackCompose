package com.example.navigationjetpackcompose.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationjetpackcompose.AUTHENTICATION_ROUTE
import com.example.navigationjetpackcompose.screens.LoginScreen
import com.example.navigationjetpackcompose.Screen
import com.example.navigationjetpackcompose.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }

        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }

    }
}