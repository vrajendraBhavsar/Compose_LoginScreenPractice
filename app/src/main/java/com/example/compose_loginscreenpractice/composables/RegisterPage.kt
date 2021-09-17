package com.example.compose_loginscreenpractice.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose_loginscreenpractice.R
import com.example.compose_loginscreenpractice.ui.theme.whiteBackground

@Composable
fun RegisterPage() {
    val image = painterResource(id = R.drawable.register_page)

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){ //Parent
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White), contentAlignment = Alignment.TopCenter){
            Image(painter = image, contentDescription = "registration image")
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.background(whiteBackground)
                .padding(10.dp)
                .
            ) {

        }
    }
}