package com.yassir.movies.data.remote.dto

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : Int,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("overview")
    val overview : String?,

    @SerializedName("release_date")
    val release : String?


) : Parcelable