package com.example.compose_loginscreenpractice

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import com.example.compose_loginscreenpractice.composables.LoginPage
import com.example.compose_loginscreenpractice.ui.theme.Compose_LoginScreenPracticeTheme

class MainActivity : ComponentActivity() {
    @ExperimentalUnitApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContent {
            Compose_LoginScreenPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
                    LoginScreen()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
@ExperimentalUnitApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_LoginScreenPracticeTheme {
        LoginScreen()
    }
}

@ExperimentalUnitApi
@Composable
fun LoginScreen(){
//    Column(
//        modifier = Modifier
//            .padding(horizontal = 20.dp)
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.Center
//    ) {
//       Text(
//           text = "Login Screen",
//           fontFamily = FontFamily.SansSerif,
//           fontWeight = FontWeight.SemiBold,
//           fontSize = 25.sp,
//           color = Color.Red,
//           textAlign = TextAlign.Center
//       )
//        Text(
//            text = "Login Screen",
//            fontFamily = FontFamily.SansSerif,
//            fontWeight = FontWeight.SemiBold,
//            fontSize = 25.sp,
//            color = Color.Red,
//            textAlign = TextAlign.Center
//        )
//    }
    LoginPage()
}