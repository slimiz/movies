package com.yassir.movies.domain.models.movieModel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieModel(
    val id: Int = 0,
    val description: String? = "",
    val title: String? = "",
    val date: String? = "",
    val image: String? = "",
) : Parcelable
