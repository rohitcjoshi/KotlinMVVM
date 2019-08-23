package com.application.mvvm.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class BookDao {
    private var bookList = ArrayList<Book>()
    private val books = MutableLiveData<ArrayList<Book>>()

    init {
        books.value = bookList
    }

    fun addBook(book: Book) {
        bookList.add(book)
        books.value = bookList
    }

    fun addAllBook(listOfBooks: ArrayList<Book>) {
        bookList = ArrayList<Book>()
        bookList.addAll(listOfBooks)
        books.value = bookList
    }

    fun getBooks() = books as LiveData<ArrayList<Book>>
}