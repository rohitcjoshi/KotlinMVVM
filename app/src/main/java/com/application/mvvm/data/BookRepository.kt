package com.application.mvvm.data

import android.os.Handler
import androidx.lifecycle.LiveData
import com.application.mvvm.AppApplication
import com.application.mvvm.db.BookDBDataBase
import com.application.mvvm.db.BooksDBThread


class BookRepository private constructor(private val bookDao: BookDao) {

    private var mDB: BookDBDataBase? = null
    private var mBooksDBThread: BooksDBThread = BooksDBThread("BookDBThread")
    private val mUiHandler = Handler()

    companion object {
        @Volatile
        private var instance: BookRepository? = null

        fun getInstance(bookDao: BookDao) =
                instance ?: synchronized(this) {
                    instance
                            ?: BookRepository(bookDao).also { instance = it }
                }
    }

    init {
        mDB = AppApplication.context?.let { BookDBDataBase.getInstance(it) }
        mBooksDBThread.start()
    }


    fun addBook(book: Book) {
        bookDao.addBook(book)
        insertBookDataInDB(book)
    }

    fun getBooks() : LiveData<ArrayList<Book>> {
        val dao = bookDao.getBooks()
        readBookDataFromDB()
        return dao
    }


    private fun insertBookDataInDB(book: Book) {
        val task = Runnable { mDB?.bookDataDao()?.insert(book) }
        mBooksDBThread.postTask(task)
    }

    private fun readBookDataFromDB() {
        val task = Runnable {
            val bookDataList = mDB?.bookDataDao()?.getAll()
            mUiHandler.post {
                if (bookDataList != null && bookDataList.isNotEmpty()) {
                    bookDao.addAllBook(listOfBooks = ArrayList(bookDataList))
                    for (book: Book in bookDataList) println(book.toString())
                }
            }
        }
        mBooksDBThread.postTask(task)

    }
}