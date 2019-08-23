package com.application.mvvm.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.application.mvvm.data.Book

@Dao
interface BookDBDataDao {

    @Query("SELECT * from bookData")
    fun getAll(): List<Book>

    @Insert(onConflict = REPLACE)
    fun insert(bookData: Book)

    @Query("DELETE from bookData")
    fun deleteAll()


}
