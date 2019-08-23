package com.application.mvvm.utilities

import com.application.mvvm.data.BookDatabase
import com.application.mvvm.data.BookRepository
import com.application.mvvm.books.BooksViewModelFactory


object RepositoryUtils {

    fun provideBooksViewModelFactory(): BooksViewModelFactory {
        val bookRepository = BookRepository.getInstance(BookDatabase.getInstance().bookDao)
        return BooksViewModelFactory(bookRepository)
    }
}