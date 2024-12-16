package com.example.kotlin_classes.abschluss_abgabe

import android.content.res.Resources.NotFoundException

class Library {
    var listOfBooks: List<Book> = emptyList()
    class Libraryaddress(val city: String, val st: String, val nr:Int, val zipCode: Int){
        fun printAddress(){
            println("Library is in $zipCode $city, $st $nr.")
        }
    }
inner class LibraryMember(val name: String, val memberID: Int){
    fun checkoutBook(book: Book, dueDate: String){
        listOfBooks.find{it == book}?.status=CheckedOut(dueDate)
    }

    fun reserveBook(book: Book){
        listOfBooks.find{it==book}?.status=Reserved(name)
    }
}
    fun addBook(book: Book){
        listOfBooks= listOfBooks+book
    }

    fun getAuthor(book: Book):String{
        return book.author
    }

    fun getTitle(book: Book):String{
        return book.title
    }

    fun showStatus(){
        for(book in listOfBooks){
            processBookStatus(book.status)
        }
    }

    fun getBook(authorOrTitle:String):Book{
        for(book in listOfBooks){
            if(book.author==authorOrTitle||book.title==authorOrTitle)
                return book
        }
        throw NotFoundException("Book not found!")
    }
}