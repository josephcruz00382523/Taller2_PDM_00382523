package com.pdm0126.foodspot.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay

@Composable
fun NavigationGraph() {
    val backStack = rememberNavBackStack(AppRoutes.RestaurantListScreen)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {

            entry<AppRoutes.RestaurantListScreen> {
                RestaurantListScreen(
                    onNavigateToDetail = { id ->
                        backStack.add(AppRoutes.ResturantDetailScreen(id))
                    },
                    onNavigateToSearch = {
                        backStack.add(AppRoutes.SearchScreen)
                    }
                )
            }

            entry<AppRoutes.ResturantDetailScreen> { route ->
                RestaurantDetailScreen(
                    restaurantId = route.id,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<AppRoutes.SearchScreen> {
                SearchScreen(
                    onNavigateToDetail = { id ->
                        backStack.add(AppRoutes.ResturantDetailScreen(id))
                    },
                    onBack = { backStack.removeLastOrNull() }
                )
            }
        }
    )
}