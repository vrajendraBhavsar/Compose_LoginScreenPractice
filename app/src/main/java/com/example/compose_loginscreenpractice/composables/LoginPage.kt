package com.example.compose_loginscreenpractice.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_loginscreenpractice.R
import com.example.compose_loginscreenpractice.ui.theme.primaryColor
import com.example.compose_loginscreenpractice.ui.theme.whiteBackground

@ExperimentalUnitApi
@Composable
fun LoginPage() {

    val image = painterResource(id = R.drawable.login_image)

    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }

    val passwordVisibility = remember { mutableStateOf(false) }

    val scrollState = rememberScrollState()
    val focusRequester = remember { FocusRequester() }

    Box(    //Parent box
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Box(    //Box in which image is placed
            modifier = Modifier.fillMaxSize().background(color = Color.White), contentAlignment = Alignment.TopCenter
        ) {
            Image(image, contentDescription = "login image")
        }
        Column(    //potion thats looking like bottomSheet
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.60f)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(whiteBackground)
                .padding(10.dp)
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Sign In",
                style = TextStyle(fontWeight = FontWeight.Bold, letterSpacing = 2.sp),
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedTextField(
                    value = emailValue.value,
                    onValueChange = {
                        emailValue.value = it
                    },
                    label = {
                        Text(text = "Email")
                    },
                    placeholder = {
                        Text(text = "enter email", color = Color.LightGray)
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(0.8f),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.MailOutline,
                            contentDescription = "email"
                        )
                    }
                )

                OutlinedTextField(
                    value = passwordValue.value,
                    onValueChange = {
                        passwordValue.value = it
                    },
                    label = {
                        Text(text = "Password")
                    },
                    placeholder = {
                        Text(text = "enter password", color = Color.LightGray)
                    },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(0.8f),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Outlined.Lock,
                            contentDescription = "password"
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = {
                            passwordVisibility.value = !passwordVisibility.value
                        }) {
                            Icon(
                                imageVector = ImageVector.Companion.vectorResource(id = R.drawable.password_eye),
                                contentDescription = "password eye",
                                tint = if (passwordVisibility.value) primaryColor else Color.Gray
                            )
                        }
                    },
                    visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
                )
                Spacer(modifier = Modifier.padding(10.dp))
                OutlinedButton(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .height(50.dp)
                ) {
                    Text(text = "log in", fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Text(
                    text = "Create An Account",
                    color = primaryColor,
                    modifier = Modifier.clickable(onClick = { })
                )
                Spacer(modifier = Modifier.padding(20.dp))
            }
        }
    }
}
