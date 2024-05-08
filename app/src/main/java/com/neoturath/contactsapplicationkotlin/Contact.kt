package com.neoturath.contactsapplicationkotlin

import java.text.SimpleDateFormat
import java.util.Date

data class Contact(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val dob: String?
) {
    companion object {
        fun parseDate(dateString: String): Date {
            val format = SimpleDateFormat("dd/MM/yyyy")
            return format.parse(dateString)
        }
    }


}