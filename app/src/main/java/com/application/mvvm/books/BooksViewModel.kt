package com.application.mvvm.books

import androidx.lifecycle.ViewModel
import com.application.mvvm.data.Book
import com.application.mvvm.data.BookRepository


class BooksViewModel(private val bookRepository: BookRepository)
    : ViewModel() {

    fun getBooks() = bookRepository.getBooks()

    fun addBook(book: Book) = bookRepository.addBook(book)
}