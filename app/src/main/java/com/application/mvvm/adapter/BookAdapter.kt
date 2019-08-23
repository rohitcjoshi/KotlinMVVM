package com.application.mvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.application.mvvm.R
import com.application.mvvm.data.Book
import com.application.mvvm.databinding.BooksBinding


class BookAdapter(private val context: Context, private val arrayList: ArrayList<Book>) : RecyclerView.Adapter<BookAdapter.BookView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookView {

        val layoutInflater = LayoutInflater.from(parent.context)
        val bookBinding: BooksBinding = DataBindingUtil.inflate(layoutInflater, R.layout.row_book, parent, false)
        return BookView(bookBinding)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: BookView, position: Int) {
        val book: Book = arrayList[position]
        holder.bind(book)
    }

    class BookView(val bookBinding: BooksBinding) : RecyclerView.ViewHolder(bookBinding.root) {
        fun bind(book: Book) {
            this.bookBinding.book = book
            bookBinding.executePendingBindings()
        }
    }
}
