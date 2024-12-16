package com.example.kotlin_classes.abschluss_abgabe


fun main(){
    val library= Library()
    val book1 = Book("1984", "No one", Genre.CHILDREN, CheckedOut("never"))
    val book2 = Book("Steelheart", "Brandon Sanderson", Genre.FICTION, Available)
    library.addBook(book1)
    library.addBook(book2)
    val address = Library.Libraryaddress("Heilbronn", "Ostsstraße", 4, 74131)
    address.printAddress()
    val member = library.LibraryMember("Angie", 123)
    member.reserveBook(book1)
    member.checkoutBook(book2, "tomorrow")
    library.showStatus()
    }
