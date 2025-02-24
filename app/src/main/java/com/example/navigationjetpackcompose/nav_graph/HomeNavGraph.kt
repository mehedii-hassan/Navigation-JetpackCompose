package com.example.navigationjetpackcompose.nav_graph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.example.navigationjetpackcompose.DETAIL_ARGUMENT_KEY
import com.example.navigationjetpackcompose.DETAIL_ARGUMENT_KEY2
import com.example.navigationjetpackcompose.screens.DetailsScreen
import com.example.navigationjetpackcompose.HOME_ROUTE
import com.example.navigationjetpackcompose.screens.HomeScreen
import com.example.navigationjetpackcompose.Screen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }
            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailsScreen(navController)
        }
    }


}