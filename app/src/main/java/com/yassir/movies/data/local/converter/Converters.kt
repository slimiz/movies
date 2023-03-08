package com.yassir.movies.data.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.yassir.movies.data.local.entity.MovieEntity
import com.yassir.movies.data.remote.dto.Movie


class Converters (){

    @TypeConverter
    fun listToJsonString(value: MutableList<Movie>?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonStringToList(value: String) = Gson().fromJson(value, Array<Movie>::class.java).toList()


}

