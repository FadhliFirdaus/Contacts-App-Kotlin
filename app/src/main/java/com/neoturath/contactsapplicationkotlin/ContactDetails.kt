package com.neoturath.contactsapplicationkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ContactDetails(navController: NavController){
    var contactName by remember { mutableStateOf("Avi") }
    var contactLastName by remember { mutableStateOf("Savannah") }
    var email by remember { mutableStateOf("avisannah@gmail.com") }
    var number by remember { mutableStateOf("01121955375") }


    LazyAppbase {
        Row{
            Image(painter = painterResource(id = R.drawable.arrow_back), contentDescription = null)
            Text("Contact Details")
        }
        Spacer(Modifier.height(15.dp))
        Divider()
        Spacer(Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color(0xFF0077B6), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "hi",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W300,
                    color = Color.White
                )
            }
        }
        Spacer(Modifier.height(30.dp))
        Text("Main Information", fontWeight = FontWeight.W400, fontSize = 15.sp, color = Color(0xFF0077B6))
        Spacer(Modifier.height(15.dp))
        Divider()
        TextAndField(title = "First Name", def = contactName, drawable = R.drawable.person_icon)
        TextAndField(title = "Last Name", def = contactLastName, drawable = R.drawable.person_icon)
        Text("Sub Information", fontWeight = FontWeight.W400, fontSize = 15.sp, color = Color(0xFF0077B6))
        Divider()
        TextAndField(title = "Email", def = email, R.drawable.email)
        TextAndField(title = "Contact Number", def = number, R.drawable.person_icon)
        Spacer(Modifier.height(15.dp))

        CenterButton(text = "Add") {

        }
        Spacer(Modifier.height(15.dp))

        CenterButton(text = "Update") {
            
        }
        Spacer(Modifier.height(15.dp))

        DeleteButton(text = "Delete") {
            
        }
        Spacer(Modifier.height(24.dp))

    }
}

@Composable
fun ContactDetailsPreview(){
    var contactName by remember { mutableStateOf("Avi") }
    var contactLastName by remember { mutableStateOf("Savannah") }
    var email by remember { mutableStateOf("avisannah@gmail.com") }
    var number by remember { mutableStateOf("01121955375") }


    LazyAppbase {
        Row{
            Image(painter = painterResource(id = R.drawable.arrow_back), contentDescription = null)
            Text("Contact Details")
        }
        Spacer(Modifier.height(15.dp))
        Divider()
        Spacer(Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(Color(0xFF0077B6), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "hi",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W300,
                    color = Color.White
                )
            }
        }
        Spacer(Modifier.height(30.dp))
        Text("Main Information", fontWeight = FontWeight.W400, fontSize = 15.sp, color = Color(0xFF0077B6))
        Spacer(Modifier.height(15.dp))
        Divider()
        TextAndField(title = "First Name", def = contactName, drawable = R.drawable.person_icon)
        TextAndField(title = "Last Name", def = contactLastName, drawable = R.drawable.person_icon)
        Text("Sub Information", fontWeight = FontWeight.W400, fontSize = 15.sp, color = Color(0xFF0077B6))
        Divider()
        TextAndField(title = "Email", def = email, R.drawable.email)
        TextAndField(title = "Contact Number", def = number, R.drawable.person_icon)
        Spacer(Modifier.height(15.dp))

        CenterButton(text = "Add") {

        }
        Spacer(Modifier.height(15.dp))

        CenterButton(text = "Update") {

        }
        Spacer(Modifier.height(15.dp))

        DeleteButton(text = "Delete") {

        }
        Spacer(Modifier.height(24.dp))

    }
}



@Preview
@Composable
fun sdsad(){
    ContactDetailsPreview()
}