package com.example.navigationjetpackcompose

const val DETAIL_ARGUMENT_KEY="id"
sealed class Screen(val route:String) {
    data object Home:Screen(route = "home_screen")
    data object Details:Screen(route = "details_screen/{$DETAIL_ARGUMENT_KEY}")
}