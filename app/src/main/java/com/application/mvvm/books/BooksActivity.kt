package com.application.mvvm.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.mvvm.R

import com.application.mvvm.adapter.BookAdapter
import com.application.mvvm.data.Book
import com.application.mvvm.utilities.RepositoryUtils
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)
        initializeUi()
    }

    private fun initializeUi() {

        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val factory = RepositoryUtils.provideBooksViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(BooksViewModel::class.java)

        viewModel.getBooks().observe(this@BooksActivity, Observer { books ->
            val stringBuilder = StringBuilder()
            books.forEach { book ->
                stringBuilder.append("$book\n\n")
            }

            val bookAdapter = BookAdapter(this, books)
            recyclerView!!.layoutManager = LinearLayoutManager(this@BooksActivity)
            recyclerView!!.adapter = bookAdapter

        })

        button_add.setOnClickListener {
            val bookObj = Book().apply {
                bookTitle = "Book: ${editText_title.text.toString()}"
                author = "Author: ${editText_author.text.toString()}"

            }

            viewModel.addBook(bookObj)
            editText_title.setText("")
            editText_author.setText("")

        }

    }


}
