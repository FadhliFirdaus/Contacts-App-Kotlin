package com.neoturath.contactsapplicationkotlin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MyProfile(navController: NavController) {

    val contact = Contact(
        id = "1",
        firstName = "John",
        lastName = "Doe",
        email = "john.doe@example.com",
        dob = "1990-05-15"
    )
    TabBase(selected = 1, navController = navController) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("My Profile")

            Text(
                text = "Logout",
                modifier = Modifier
                    .padding(12.dp)
                    .clickable {
                               navController.navigate(SCREEN.LOGIN.toString())
                    },
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 21.sp,
                color = Color(0xFF0077B6)
            )
        }

        Divider()
        Spacer(Modifier.height(24.dp))
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
                    text = "${contact.firstName.first()}${contact.lastName.first()}",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W300,
                    color = Color.White
                )
            }
        }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(), // Adjust the padding value as needed
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center // Align children to the center horizontally
            ) {
                Text("${contact.firstName} ${contact.lastName}", fontSize = 18.sp, fontWeight = FontWeight.W400)
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth(), // Adjust the padding value as needed
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center // Align children to the center horizontally
            ) {
                Text(contact.email, fontSize = 18.sp, fontWeight = FontWeight.W400)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Text(contact.dob ?: "", fontSize = 18.sp, fontWeight = FontWeight.W400)
            }
        }

        CenterButton(text = "Update My Detail") {
            
        }
    }
}


@Composable
fun MyProfilePreview() {

    val contact = Contact(
        id = "1",
        firstName = "John",
        lastName = "Doe",
        email = "john.doe@example.com",
        dob = "1990-05-15"
    )
    TabBasePreview(selected = 1) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("My Profile")

            Text(
                text = "Logout",
                modifier = Modifier
                    .padding(12.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 21.sp,
                color = Color(0xFF0077B6)
            )
        }

        Divider()
        Spacer(Modifier.height(24.dp))
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
                    text = "${contact.firstName.first()}${contact.lastName.first()}",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.W300,
                    color = Color.White
                )
            }
        }

        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(), // Adjust the padding value as needed
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center // Align children to the center horizontally
            ) {
                Text("${contact.firstName} ${contact.lastName}", fontSize = 18.sp, fontWeight = FontWeight.W400)
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth(), // Adjust the padding value as needed
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center // Align children to the center horizontally
            ) {
                Text(contact.email, fontSize = 18.sp, fontWeight = FontWeight.W400)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Text(contact.dob ?: "", fontSize = 18.sp, fontWeight = FontWeight.W400)
            }
        }

        CenterButton(text = "Update My Detail") {

        }
    }
}

@Preview
@Composable
fun asdasdas() {
    MyProfilePreview()
}