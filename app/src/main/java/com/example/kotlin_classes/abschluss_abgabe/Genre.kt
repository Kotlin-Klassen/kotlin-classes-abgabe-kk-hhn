package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String){
    FICTION("Fictional works"),
    NON_FICTION("Non-fictional works"),
    SCIENCE("Scientific books and research papers"),
    HISTORY("Historic articles and books"),
    CHILDREN("Childrens books and stories");

    fun printDescription() {
        println(description)
    }
}