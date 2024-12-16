package com.example.kotlin_classes.abschluss_abgabe

import com.example.kotlin_classes.classes.sealed_class.CashOnDelivery
import com.example.kotlin_classes.classes.sealed_class.CreditCard
import com.example.kotlin_classes.classes.sealed_class.PaymentMethod
import com.example.kotlin_classes.classes.sealed_class.Paypal

sealed class BookStatus

data class CheckedOut(val dueDate: String):BookStatus()
data class Reserved(val reservedBy: String):BookStatus()
object Available:BookStatus()

fun processBookStatus(bookStatus: BookStatus){
    when (bookStatus) {
        is CheckedOut -> println("Book is checked out until ${bookStatus.dueDate}\n")
        is Reserved -> println("Book is reserved by ${bookStatus.reservedBy}\n")
        Available -> println("Book is available!\n")
    }
}