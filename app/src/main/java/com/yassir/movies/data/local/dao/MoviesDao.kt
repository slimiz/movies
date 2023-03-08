package com.yassir.movies.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yassir.movies.data.local.entity.MovieEntity

@Dao
interface MoviesDao {

    /**
     * Insert all movies.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(orders: MutableList<MovieEntity>)


    /**
     * Get saved movie.
     * **/
    @Query("SELECT * FROM movies ")
    fun getSavedMovies(): MutableList<MovieEntity>


}