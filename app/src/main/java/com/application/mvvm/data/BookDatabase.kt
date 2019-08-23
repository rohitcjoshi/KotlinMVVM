package com.application.mvvm.data


class BookDatabase private constructor() {

    var bookDao = BookDao()
        private set

    companion object {
        @Volatile private var instance: BookDatabase? = null

        fun getInstance() =
                instance ?: synchronized(this) {
                    instance
                            ?: BookDatabase().also { instance = it }
                }
    }
}