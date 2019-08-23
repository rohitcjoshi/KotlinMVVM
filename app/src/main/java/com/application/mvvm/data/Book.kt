package com.application.mvvm.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookData")
data class Book(@PrimaryKey(autoGenerate = true) var id: Long?,
                    @ColumnInfo(name = "title") var bookTitle: String,
                    @ColumnInfo(name = "author") var author: String

){
    constructor():this(null,"","")
}