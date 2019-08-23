package com.application.mvvm.books;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/application/mvvm/books/BooksViewModel;", "Landroidx/lifecycle/ViewModel;", "bookRepository", "Lcom/application/mvvm/data/BookRepository;", "(Lcom/application/mvvm/data/BookRepository;)V", "addBook", "", "book", "Lcom/application/mvvm/data/Book;", "getBooks", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "app_debug"})
public final class BooksViewModel extends androidx.lifecycle.ViewModel {
    private final com.application.mvvm.data.BookRepository bookRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.mvvm.data.Book>> getBooks() {
        return null;
    }
    
    public final void addBook(@org.jetbrains.annotations.NotNull()
    com.application.mvvm.data.Book book) {
    }
    
    public BooksViewModel(@org.jetbrains.annotations.NotNull()
    com.application.mvvm.data.BookRepository bookRepository) {
        super();
    }
}