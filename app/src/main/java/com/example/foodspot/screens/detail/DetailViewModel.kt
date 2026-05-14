package com.example.foodspot.screens.detail

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.FoodRepository
import com.example.foodspot.data.repository.FoodRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(
    private val repository: FoodRepository = FoodRepositoryImpl()
) : ViewModel() {

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant: StateFlow<Restaurant?> = _restaurant.asStateFlow()

    fun loadRestaurant(id: Int) {
        _restaurant.value = repository.getRestaurantById(id)
    }
}