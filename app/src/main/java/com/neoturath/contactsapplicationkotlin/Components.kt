package com.neoturath.contactsapplicationkotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun AppBase(content: @Composable () -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(24.dp)
    ) {
        content()
    }
}

@Composable
fun LazyAppbase(content: @Composable () -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(start = 24.dp, top = 24.dp, end = 24.dp)
            .padding(bottom = 0.dp)
            .verticalScroll(rememberScrollState())
    ) {
        content()
    }
}
@Composable
fun TabBase(selected: Int, navController: NavController, content: @Composable () -> Unit) {
    var password by remember{ mutableStateOf(selected) }

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            Modifier.padding(24.dp)
        ) {
            content()
        }
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            TabButtons(selected = mutableStateOf(password), navController)
        }
    }
}


@Composable
fun TabBasePreview(selected: Int, content: @Composable () -> Unit) {
    var password by remember{ mutableStateOf(selected) }

    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            Modifier.padding(24.dp)
        ) {
            content()
        }
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            TabButtonsPreview(selected = mutableStateOf(password))
        }
    }
}



@Composable
fun TabButtonsPreview(selected: MutableState<Int>) {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Divider()
        Row(
            Modifier
                .fillMaxWidth()
                .height(80.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.category_icon),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(if (selected.value == 1) Color.Black else Color.Blue),
                modifier = Modifier.clickable {
                    selected.value = 0
                }
            )
            Image(
                painter = painterResource(id = R.drawable.person_icon),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(if (selected.value == 0) Color.Black else Color.Blue),
                modifier = Modifier.clickable {
                    selected.value = 1
                }
            )
        }
    }
}
@Composable
fun TabButtons(selected: MutableState<Int>, navController: NavController) {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Divider()
        Row(
            Modifier
                .fillMaxWidth()
                .height(80.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.category_icon),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(if (selected.value == 1) Color.Black else Color.Blue),
                modifier = Modifier.clickable {
                    selected.value = 0
                    navController.navigate(SCREEN.DETAIL.toString())
                }
            )
            Image(
                painter = painterResource(id = R.drawable.person_icon),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(if (selected.value == 0) Color.Black else Color.Blue),
                modifier = Modifier.clickable {
                    selected.value = 1
                    navController.navigate(SCREEN.PROFILE.toString())
                }
            )
        }
    }
}

@Composable
fun TextAndField(title: String, def: String, drawable:Int) {
    var text by remember { mutableStateOf(def) }

    Column(
        Modifier.padding(vertical = 6.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(title, Modifier.padding(vertical = 6.dp))
        CustomTextField(text = def, imageId = drawable)
//        TextField(
//            value = text,
//            onValueChange = {
//                text = it
//            },
//            Modifier
//                .fillMaxWidth()
//                .padding(vertical = 6.dp)
//        )
    }
}

@Composable
fun CenterButton(text: String, onClick: () -> Unit) {
    Column(
        Modifier
            .fillMaxWidth()
            .height(53.dp)
            .background(color = Color(0x1096D3F2), shape = RoundedCornerShape(12.dp))
            .clickable { onClick() },
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 21.sp,
            color = Color(0xFF0077B6)
        )
    }
}
@Composable
fun DeleteButton(text: String, onClick: () -> Unit) {
    Column(
        Modifier
            .fillMaxWidth()
            .height(53.dp)
            .background(color = Color.White, shape = RoundedCornerShape(12.dp))
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(12.dp))
            .clickable { onClick() },
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 21.sp,
            color = Color.Red
        )
    }
}

@Composable
fun CustomTextField(text: String, imageId:Int) {
    var text by remember { mutableStateOf(text) }

    Box(
        Modifier
            .height(60.dp)
            .border(
                width = 0.5.dp,
                color = Color(0xFF0077B6),
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        BasicTextField(
            value = text,
            onValueChange = { (it) },
            Modifier
                .align(Alignment.CenterStart)
                .padding(start = 56.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(painter = painterResource(id = imageId
            ), contentDescription = null)
        }
    }
}


@Preview
@Composable
fun preasdv() {
    CustomTextField(text = "hehe", imageId = R.drawable.arrow_back)
}
