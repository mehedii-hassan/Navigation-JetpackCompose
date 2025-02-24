package com.example.navigationjetpackcompose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    data object Home : Screen(route = "home_screen")

    //optional argument======================================================================
    data object Details : Screen(route = "details_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}") {
        //Multiple argument
        fun passNameAndId(id: Int = 0, name: String = "Mehedi"): String {
            return "details_screen?id=$id&name=$name"
        }
    }
    data object Login: Screen(route = "login_screen")
    data object SignUp: Screen(route = "sign_up_screen")
}