package com.example.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.foodspot.screens.detail.DetailScreen
import com.example.foodspot.screens.home.HomeScreen
import com.example.foodspot.screens.search.SearchScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home) {

        composable<Routes.Home> {
            HomeScreen(navController)
        }

        composable<Routes.Search> {
            SearchScreen(navController)
        }

        composable<Routes.Detail> { backStackEntry ->
            val route = backStackEntry.toRoute<Routes.Detail>()
            DetailScreen(navController, route.restaurantId)
        }
    }
}