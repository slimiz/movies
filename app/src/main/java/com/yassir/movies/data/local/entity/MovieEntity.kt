package com.yassir.movies.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MovieEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val description: String? = "",
    val title: String? = "",
    val date: String? = "",
    val image: String? = "",

)

