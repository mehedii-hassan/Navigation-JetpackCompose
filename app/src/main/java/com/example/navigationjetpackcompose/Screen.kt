package com.example.navigationjetpackcompose

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    data object Home : Screen(route = "home_screen")
    data object Details : Screen(route = "details_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {

        //Single argument
        /*   fun passId(id: Int): String {
               //return "details_screen/$id"
               return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
           }*/

        //Multiple argument
        fun passNameAndId(id: Int, name: String): String {
            return "details_screen/$id/$name"
        }

    }
}