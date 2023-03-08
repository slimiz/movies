package com.yassir.movies.data.remote.dto

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movies : MutableList<Movie> = mutableListOf()

) : Parcelable