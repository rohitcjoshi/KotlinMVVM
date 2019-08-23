package com.application.mvvm.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/application/mvvm/adapter/BookAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/application/mvvm/adapter/BookAdapter$BookView;", "context", "Landroid/content/Context;", "arrayList", "Ljava/util/ArrayList;", "Lcom/application/mvvm/data/Book;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BookView", "app_debug"})
public final class BookAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.application.mvvm.adapter.BookAdapter.BookView> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.application.mvvm.data.Book> arrayList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.application.mvvm.adapter.BookAdapter.BookView onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.application.mvvm.adapter.BookAdapter.BookView holder, int position) {
    }
    
    public BookAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.mvvm.data.Book> arrayList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/application/mvvm/adapter/BookAdapter$BookView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bookBinding", "Lcom/application/mvvm/databinding/BooksBinding;", "(Lcom/application/mvvm/databinding/BooksBinding;)V", "getBookBinding", "()Lcom/application/mvvm/databinding/BooksBinding;", "bind", "", "book", "Lcom/application/mvvm/data/Book;", "app_debug"})
    public static final class BookView extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.application.mvvm.databinding.BooksBinding bookBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.application.mvvm.data.Book book) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.application.mvvm.databinding.BooksBinding getBookBinding() {
            return null;
        }
        
        public BookView(@org.jetbrains.annotations.NotNull()
        com.application.mvvm.databinding.BooksBinding bookBinding) {
            super(null);
        }
    }
}