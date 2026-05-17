package com.pdm0126.foodspot.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.RestaurantListScreen

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
                // TODO: Implementar RestaurantDetailScreen
            }

            entry<AppRoutes.RestaurantSearch> {
                // TODO: Implementar SearchScreen
            }
        }
    )
}
