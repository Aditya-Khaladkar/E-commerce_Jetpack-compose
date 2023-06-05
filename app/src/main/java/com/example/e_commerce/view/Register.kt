package com.example.e_commerce.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerce.R
import com.example.e_commerce.ui.theme.newAppThemeColor

@Composable
fun Register() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = "Here's \nyour first \nstep with \nus",
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            )

            Image(
                painter = painterResource(id = R.drawable.splash_screen_img_logo),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
            )
        }

        Box {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .shadow(elevation = 10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = username,
                        onValueChange = { username = it },
                        label = { Text(text = "Enter Username") },
                        placeholder = { Text(text = "Adi") }
                    )

                    Spacer(modifier = Modifier.height(30.dp))
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = email,
                        onValueChange = { email = it },
                        label = { Text(text = "Enter email") },
                        placeholder = { Text(text = "youremail@example.com") }
                    )

                    Spacer(modifier = Modifier.height(30.dp))
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = password,
                        onValueChange = { password = it },
                        label = { Text(text = "Enter password") },
                        placeholder = { Text(text = "Bata mat kisi ko") }
                    )

                    Spacer(modifier = Modifier.height(30.dp))
                    Button(
                        colors = ButtonDefaults.buttonColors(
                            containerColor = newAppThemeColor
                        ),
                        onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "R E G I S T E R")
                    }
                }
            }

        }

        Divider(
            color = Color.LightGray, thickness = 1.dp,
            modifier = Modifier.padding(50.dp)
        )

        Text(
            modifier = Modifier.clickable {

            },
            text = "Already have an account ? Click here to Login !"
        )
    }
}