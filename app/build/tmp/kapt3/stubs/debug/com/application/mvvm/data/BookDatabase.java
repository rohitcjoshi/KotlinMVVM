package com.application.mvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/application/mvvm/data/BookDatabase;", "", "()V", "<set-?>", "Lcom/application/mvvm/data/BookDao;", "bookDao", "getBookDao", "()Lcom/application/mvvm/data/BookDao;", "Companion", "app_debug"})
public final class BookDatabase {
    @org.jetbrains.annotations.NotNull()
    private com.application.mvvm.data.BookDao bookDao;
    private static volatile com.application.mvvm.data.BookDatabase instance;
    public static final com.application.mvvm.data.BookDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.application.mvvm.data.BookDao getBookDao() {
        return null;
    }
    
    private BookDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/application/mvvm/data/BookDatabase$Companion;", "", "()V", "instance", "Lcom/application/mvvm/data/BookDatabase;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.application.mvvm.data.BookDatabase getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}