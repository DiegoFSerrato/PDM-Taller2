package com.example.foodspot.screens.home

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.FoodRepository
import com.example.foodspot.data.repository.FoodRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(
    private val repository: FoodRepository = FoodRepositoryImpl()
) : ViewModel() {

    private val _categorizedRestaurants = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val categorizedRestaurants: StateFlow<Map<String, List<Restaurant>>> = _categorizedRestaurants.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        val allRestaurants = repository.getAllRestaurants()
        val groupedMap = mutableMapOf<String, MutableList<Restaurant>>()

        allRestaurants.forEach { restaurant ->
            restaurant.categories.forEach { category ->
                groupedMap.getOrPut(category) { mutableListOf() }.add(restaurant)
            }
        }

        _categorizedRestaurants.value = groupedMap
    }
}