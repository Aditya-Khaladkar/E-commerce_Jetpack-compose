package com.example.e_commerce.view

import android.os.Handler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce.R
import com.example.e_commerce.navigation.Screen

@Composable
fun SplashScreenComponent(navController: NavController) {

    // navigate to login scree
    Handler().postDelayed(Runnable {
        navController.navigate(Screen.LoginScreen.route)
    }, 2000)

    Box(modifier = Modifier.fillMaxSize().background(color = Color.White)) {
        Image(
            painter = painterResource(id = R.drawable.splash_screen_img_logo),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.Center)
        )
        Text(
            text = "Created with Jetpack compose", fontSize = 20.sp, modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenComponentPreview() {
    SplashScreenComponent(navController = rememberNavController())
}