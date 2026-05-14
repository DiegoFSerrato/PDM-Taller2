package com.example.foodspot.screens.detail

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController, restaurantId: Int) {
    Text(text = "Pantalla 2: Detalle del restaurante $restaurantId")
}