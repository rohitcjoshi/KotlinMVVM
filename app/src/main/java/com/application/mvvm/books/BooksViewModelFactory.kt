package com.application.mvvm.books

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.application.mvvm.data.BookRepository


class BooksViewModelFactory(private val bookRepository: BookRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BooksViewModel(bookRepository) as T
    }
}