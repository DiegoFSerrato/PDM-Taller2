package com.example.foodspot.screens.search

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.FoodRepository
import com.example.foodspot.data.repository.FoodRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SearchViewModel(
    private val repository: FoodRepository = FoodRepositoryImpl()
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _searchResults = MutableStateFlow<List<Restaurant>>(emptyList())
    val searchResults: StateFlow<List<Restaurant>> = _searchResults.asStateFlow()

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query

        if (query.isBlank()) {
            _searchResults.value = emptyList()
        } else {
            val allRestaurants = repository.getAllRestaurants()
            _searchResults.value = allRestaurants.filter { restaurant ->
                // Filtra por nombre del restaurante O por nombre de platillo (case-insensitive)
                restaurant.name.contains(query, ignoreCase = true) ||
                        restaurant.menu.any { dish -> dish.name.contains(query, ignoreCase = true) }
            }
        }
    }
}