package com.application.mvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u0011j\b\u0012\u0004\u0012\u00020\u000e`\u00120\u0010J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/application/mvvm/data/BookRepository;", "", "bookDao", "Lcom/application/mvvm/data/BookDao;", "(Lcom/application/mvvm/data/BookDao;)V", "mBooksDBThread", "Lcom/application/mvvm/db/BooksDBThread;", "mDB", "Lcom/application/mvvm/db/BookDBDataBase;", "mUiHandler", "Landroid/os/Handler;", "addBook", "", "book", "Lcom/application/mvvm/data/Book;", "getBooks", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "insertBookDataInDB", "readBookDataFromDB", "Companion", "app_debug"})
public final class BookRepository {
    private com.application.mvvm.db.BookDBDataBase mDB;
    private com.application.mvvm.db.BooksDBThread mBooksDBThread;
    private final android.os.Handler mUiHandler = null;
    private final com.application.mvvm.data.BookDao bookDao = null;
    private static volatile com.application.mvvm.data.BookRepository instance;
    public static final com.application.mvvm.data.BookRepository.Companion Companion = null;
    
    public final void addBook(@org.jetbrains.annotations.NotNull()
    com.application.mvvm.data.Book book) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.mvvm.data.Book>> getBooks() {
        return null;
    }
    
    private final void insertBookDataInDB(com.application.mvvm.data.Book book) {
    }
    
    private final void readBookDataFromDB() {
    }
    
    private BookRepository(com.application.mvvm.data.BookDao bookDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/application/mvvm/data/BookRepository$Companion;", "", "()V", "instance", "Lcom/application/mvvm/data/BookRepository;", "getInstance", "bookDao", "Lcom/application/mvvm/data/BookDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.application.mvvm.data.BookRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.application.mvvm.data.BookDao bookDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}