package com.pdm0126.foodspot.screens



import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.RestaurantRepository
import com.pdm0126.foodspot.data.RestaurantRepositoryImpl
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SearchViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val _results = MutableStateFlow<List<Restaurant>>(emptyList())
    val results: StateFlow<List<Restaurant>> = _results.asStateFlow()

    fun onQueryChange(newQuery: String) {
        _query.value = newQuery
        _results.value = filterRestaurants(newQuery)
    }

    private fun filterRestaurants(query: String): List<Restaurant> {
        if (query.isBlank()) return emptyList()
        return repository.getRestaurants().filter { restaurant ->
            val matchesName = restaurant.name.contains(query, ignoreCase = true)
            val matchesDish = restaurant.menu.any { dish ->
                dish.name.contains(query, ignoreCase = true)
            }
            matchesName || matchesDish
        }
    }
}