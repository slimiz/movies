package com.yassir.movies.data.repositories.movieLocalDataSource


import com.yassir.movies.domain.models.movieModel.MovieModel

interface MovieLocalDataSource {

    suspend fun saveMovies(movies: MutableList<MovieModel>)
    suspend fun getSavedMovies(): MutableList<MovieModel>

}