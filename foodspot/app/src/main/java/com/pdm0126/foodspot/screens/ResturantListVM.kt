package com.pdm0126.foodspot.screens



import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.RestaurantRepository
import com.pdm0126.foodspot.data.RestaurantRepositoryImpl
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantListViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _groupedRestaurants = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val groupedRestaurants: StateFlow<Map<String, List<Restaurant>>> = _groupedRestaurants.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        val grouped = mutableMapOf<String, MutableList<Restaurant>>()
        repository.getRestaurants().forEach { restaurant ->
            restaurant.categories.forEach { category ->
                grouped.getOrPut(category) { mutableListOf() }.add(restaurant)
            }
        }
        _groupedRestaurants.value = grouped
    }
}