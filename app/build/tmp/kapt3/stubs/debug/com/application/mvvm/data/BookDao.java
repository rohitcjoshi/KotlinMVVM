package com.application.mvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/application/mvvm/data/BookDao;", "", "()V", "bookList", "Ljava/util/ArrayList;", "Lcom/application/mvvm/data/Book;", "books", "Landroidx/lifecycle/MutableLiveData;", "addAllBook", "", "listOfBooks", "Lkotlin/collections/ArrayList;", "addBook", "book", "getBooks", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class BookDao {
    private java.util.ArrayList<com.application.mvvm.data.Book> bookList;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.mvvm.data.Book>> books = null;
    
    public final void addBook(@org.jetbrains.annotations.NotNull()
    com.application.mvvm.data.Book book) {
    }
    
    public final void addAllBook(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.mvvm.data.Book> listOfBooks) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.mvvm.data.Book>> getBooks() {
        return null;
    }
    
    public BookDao() {
        super();
    }
}