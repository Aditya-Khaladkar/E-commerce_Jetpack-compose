package com.example.e_commerce.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.e_commerce.auth.Login
import com.example.e_commerce.auth.Register
import com.example.e_commerce.view.Dashboard
import com.example.e_commerce.view.SplashScreenComponent

@Composable
fun NavigationGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreenComponent(navHostController)
        }
        composable(route = Screen.LoginScreen.route) {
            Login(navHostController)
        }
        composable(route = Screen.RegisterScreen.route) {
            Register()
        }
        composable(route = Screen.DashboardView.route) {
            Dashboard()
        }
    }
}