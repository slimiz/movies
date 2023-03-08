package com.yassir.movies.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yassir.movies.data.local.converter.Converters
import com.yassir.movies.data.local.dao.MoviesDao
import com.yassir.movies.data.local.entity.MovieEntity

/**
 * Created by Slim aloui on 07/03/2023
 */
@Database(
        entities = [MovieEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MoviesDao

}