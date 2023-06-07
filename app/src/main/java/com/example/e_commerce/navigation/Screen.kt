package com.example.e_commerce.navigation

sealed class Screen(val route: String) {
    object SplashScreen: Screen(route = "splash_screen")
    object LoginScreen: Screen(route = "login")
    object RegisterScreen: Screen(route = "register")
    object DashboardView: Screen(route = "dashboard_view")
}
