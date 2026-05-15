package com.example.foodspot.screens.detail

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Dish
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.FoodRepository
import com.example.foodspot.data.repository.FoodRepositoryImpl
import com.example.foodspot.data.repository.SessionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(
    private val repository: FoodRepository = FoodRepositoryImpl()
) : ViewModel() {

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant: StateFlow<Restaurant?> = _restaurant.asStateFlow()

    val cart: StateFlow<List<Dish>> = SessionRepository.cart

    fun loadRestaurant(id: Int) {
        _restaurant.value = repository.getRestaurantById(id)
    }

    fun addToCart(dish: Dish) {
        SessionRepository.addToCart(dish)
    }
}