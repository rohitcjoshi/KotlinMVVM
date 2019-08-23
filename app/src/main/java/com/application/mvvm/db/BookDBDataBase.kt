package com.application.mvvm.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.application.mvvm.AppApplication
import com.application.mvvm.data.Book


@Database(entities = arrayOf(Book::class), version = 1)
abstract class BookDBDataBase : RoomDatabase() {

    abstract fun bookDataDao(): BookDBDataDao

    companion object {

        private var INSTANCE: BookDBDataBase? = null
        fun getInstance(context: Context): BookDBDataBase? {
            if (INSTANCE == null) {
                synchronized(BookDBDataBase::class) {
                    INSTANCE = AppApplication.context?.let { Room.databaseBuilder(it, BookDBDataBase::class.java, "book.db").build() }
                }
            }
            return INSTANCE
        }
    }
}