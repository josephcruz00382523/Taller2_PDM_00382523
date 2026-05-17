package com.pdm0126.foodspot.Navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface AppRoutes : NavKey {
    @Serializable
    data object RestaurantList : AppRoutes

    @Serializable
    data class RestaurantDetail(val id: Int) : AppRoutes

    @Serializable
    data object RestaurantSearch : AppRoutes
}
