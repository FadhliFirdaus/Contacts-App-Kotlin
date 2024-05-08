package com.neoturath.contactsapplicationkotlin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun LoginPage(navController: NavController){
    val username by remember{ mutableStateOf("Lintang Kusuma") }
    val password by remember{ mutableStateOf("*******") }

    AppBase {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Text("Hi There", fontWeight = FontWeight.W600, color = Color(0xFF0077B6))
            Text("Please login to see your contact list")
            Spacer(
                Modifier.height(24.dp))
            TextAndField(title = "Username", def = "username", drawable = R.drawable.person_icon)
            TextAndField(title = "Username", def = "asdad", drawable = R.drawable.email)
            Spacer(Modifier.height(60.dp))
            CenterButton(text = "Login") {
                navController.navigate(SCREEN.DETAIL.toString())
            }
        }
    }
}

@Composable
fun LoginPage(){
    AppBase {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Text("Hi There", fontWeight = FontWeight.W600, color = Color(0xFF0077B6))
            Text("Please login to see your contact list")
            Spacer(
                Modifier.height(24.dp))
            TextAndField(title = "Username", def = "username", drawable = R.drawable.person_icon)
            TextAndField(title = "Username", def = "asdad", drawable = R.drawable.email)
            Spacer(Modifier.height(60.dp))
            CenterButton(text = "Login") {
            }
        }
    }
}

@Preview
@Composable
fun sdasdsds(){
    LoginPage()
}
