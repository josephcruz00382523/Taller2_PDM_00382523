package com.pdm0126.foodspot.screens



import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.RestaurantRepository
import com.pdm0126.foodspot.data.RestaurantRepositoryImpl
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantDetailViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant: StateFlow<Restaurant?> = _restaurant.asStateFlow()

    fun loadRestaurant(id: Int) {
        _restaurant.value = repository.getRestaurantById(id)
    }
}