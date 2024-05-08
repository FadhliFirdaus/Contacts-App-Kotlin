package com.neoturath.contactsapplicationkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.navigation.compose.rememberNavController


@Composable
fun DetailPage(navController: NavController) {
    var text by remember { mutableStateOf("Search your contact list") }
    var tabSelection by remember { mutableStateOf(0) }
    var contactList by remember { mutableStateOf(emptyList<Contact>()) }

    val contactsMock = listOf(
        Contact(
            id = "1",
            firstName = "John",
            lastName = "Doe",
            email = "john.doe@example.com",
            dob = "1990-05-15"
        ),
        Contact(
            id = "2",
            firstName = "Jane",
            lastName = "Smith",
            email = "jane.smith@example.com",
            dob = "1985-08-22"
        ),
        Contact(
            id = "3",
            firstName = "Alice",
            lastName = "Johnson",
            email = "alice.johnson@example.com",
            dob = null
        )
    )

    TabBase (selected = tabSelection, navController = navController){
        if(tabSelection == 0) {
            Text(text = "My Contacts", fontSize = 23.sp, fontWeight = FontWeight.W700)
            Spacer(Modifier.height(30.dp))
            Divider()
            Spacer(Modifier.height(15.dp))
            CustomSearchField(text)
            Spacer(Modifier.height(15.dp))
        }
    }

    LaunchedEffect(Unit) {
        decipherDataJson()
    }
}

@Composable
fun DetailPagePreview() {
    var text by remember { mutableStateOf("Search your contact list") }
    var contactList by remember { mutableStateOf(emptyList<Contact>()) }
//    var navController = NavController()
    val contactsMock = listOf(
        Contact(
            id = "1",
            firstName = "John",
            lastName = "Doe",
            email = "john.doe@example.com",
            dob = "1990-05-15"
        ),
        Contact(
            id = "2",
            firstName = "Jane",
            lastName = "Smith",
            email = "jane.smith@example.com",
            dob = "1985-08-22"
        ),
        Contact(
            id = "3",
            firstName = "Alice",
            lastName = "Johnson",
            email = "alice.johnson@example.com",
            dob = null
        )
    )

    TabBasePreview (selected = 0){
        Text(text = "My Contacts", fontSize = 23.sp, fontWeight = FontWeight.W700)
        Spacer(Modifier.height(30.dp))
        Divider()
        Spacer(Modifier.height(15.dp))
        CustomSearchField(text)
        Spacer(Modifier.height(15.dp))
    }

    LaunchedEffect(Unit) {
        decipherDataJson()
    }
}

fun decipherDataJson() {

}


@Composable
fun LazyPrefixView(contacts: List<Contact>, prefix: Char) {

}

@Composable
fun CustomSearchField(text: String) {
    var text by remember { mutableStateOf(text) }

    Box(
        Modifier
            .height(60.dp)
            .border(
                width = 0.5.dp,
                color = Color(0xFFCCCCCC),
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        BasicTextField(
            value = text,
            onValueChange = { (it) },
            Modifier
                .align(Alignment.CenterStart)
                .padding(start = 16.dp) // Add padding to adjust the position
        )
        Row(
            Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Image(painter = painterResource(id = R.drawable.search_cion), contentDescription = null)
        }
    }
}


@Preview
@Composable
fun sdsadasdasdqw() {
//    DetailPagePreview()
}