package com.example.foodspot.screens.cart

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Dish
import com.example.foodspot.data.repository.SessionRepository
import kotlinx.coroutines.flow.StateFlow

class CartViewModel : ViewModel() {
    val cartItems: StateFlow<List<Dish>> = SessionRepository.cart
}