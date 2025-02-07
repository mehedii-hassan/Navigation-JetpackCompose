package com.example.navigationjetpackcompose

sealed class Screen(val route:String) {
    data object Home:Screen(route = "home_screen")
    data object Details:Screen(route = "details_screen/{id}")
}