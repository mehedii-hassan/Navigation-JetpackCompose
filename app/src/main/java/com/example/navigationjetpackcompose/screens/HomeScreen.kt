package com.example.navigationjetpackcompose.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationjetpackcompose.AUTHENTICATION_ROUTE
import com.example.navigationjetpackcompose.Screen

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                //navHostController.navigate(route = "details_screen/"+2)
                navHostController.navigate(route = Screen.Details.passNameAndId(id = 10))
            },
            text = "Home",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                     navHostController.navigate(AUTHENTICATION_ROUTE)
                },
            text = "Login/Sign Up",
            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
            fontWeight = FontWeight.Medium
        )
    }

}

@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview() {
    HomeScreen(navHostController = rememberNavController())
}