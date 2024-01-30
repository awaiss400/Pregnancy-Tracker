package com.stone.users.awais.personal.pregnancytrackercompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stone.users.awais.personal.pregnancytrackercompose.presentation.screens.PremiumScreen
import com.stone.users.awais.personal.pregnancytrackercompose.presentation.viewModels.SharedViewModel
import com.stone.users.awais.personal.pregnancytrackercompose.presentation.screens.SplashScreen


val LocalNavController = compositionLocalOf<NavHostController> {
    error("No NavController provided")
}
val LocalViewModel = compositionLocalOf<SharedViewModel> {
    error("No ViewModel provided")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val sharedViewModel: SharedViewModel = hiltViewModel() //if use shared then this
    CompositionLocalProvider(
        LocalNavController provides navController
    ) {
        NavHost(navController = navController, startDestination = Routes.Splash.route) {
            composable(Routes.Splash.route) {
                SplashScreen()
            }
            composable(Routes.Premium.route) {
                PremiumScreen()
            }
        }
    }
}