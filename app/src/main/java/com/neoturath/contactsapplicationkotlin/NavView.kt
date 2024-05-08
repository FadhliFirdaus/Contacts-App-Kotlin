package com.neoturath.contactsapplicationkotlin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavView() {
    Box(
        Modifier.fillMaxSize()
    ){
        val mainNavController = rememberNavController()
        NavHost(navController = mainNavController, startDestination = SCREEN.LOGIN.toString()) {
            composable(SCREEN.LOGIN.toString()) {
                LoginPage(mainNavController)
            }
            composable(SCREEN.CONTACTS.toString()) {
                ContactDetails(mainNavController)
            }
            composable(SCREEN.DETAIL.toString()) {
                DetailPage(mainNavController)
            }
            composable(SCREEN.PROFILE.toString()) {
                MyProfile(mainNavController)
            }
        }
    }
}

enum class SCREEN() {
    LOGIN,
    CONTACTS,
    DETAIL,
    PROFILE
}
