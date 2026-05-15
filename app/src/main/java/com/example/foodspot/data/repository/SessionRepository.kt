package com.example.foodspot.data.repository

import com.example.foodspot.data.model.Dish
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object SessionRepository {
    private val _cart = MutableStateFlow<List<Dish>>(emptyList())
    val cart: StateFlow<List<Dish>> = _cart.asStateFlow()

    private val _favoriteRestaurants = MutableStateFlow<Set<Int>>(emptySet())
    val favoriteRestaurants: StateFlow<Set<Int>> = _favoriteRestaurants.asStateFlow()

    fun addToCart(dish: Dish) {
        _cart.value += dish
    }

    fun toggleFavorite(restaurantId: Int) {
        val current = _favoriteRestaurants.value
        _favoriteRestaurants.value = if (current.contains(restaurantId)) {
            current - restaurantId
        } else {
            current + restaurantId
        }
    }
}