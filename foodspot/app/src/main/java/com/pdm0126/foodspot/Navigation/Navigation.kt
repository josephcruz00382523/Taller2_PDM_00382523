package com.pdm0126.foodspot.Navigation

import androidx.compose.runtime.Composable

import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.RestaurantDetailScreen
import com.pdm0126.foodspot.screens.RestaurantListScreen
import com.pdm0126.foodspot.screens.SearchScreen

@Composable
fun NavigationGraph() {
    val backStack = rememberNavBackStack(AppRoutes.RestaurantList)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {

            entry<AppRoutes.RestaurantList> {
                RestaurantListScreen(
                    onNavigateToDetail = { id ->
                        backStack.add(AppRoutes.RestaurantDetail(id))
                    },
                    onNavigateToSearch = {
                        backStack.add(AppRoutes.RestaurantSearch)
                    }
                )
            }

            entry<AppRoutes.RestaurantDetail> { route ->
                RestaurantDetailScreen(
                    restaurantId = route.id,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<AppRoutes.RestaurantSearch> {
                SearchScreen(
                    onNavigateToDetail = { id ->
                        backStack.add(AppRoutes.RestaurantDetail(id))
                    },
                    onBack = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}
