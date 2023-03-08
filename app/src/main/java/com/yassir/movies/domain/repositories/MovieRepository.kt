package com.yassir.movies.domain.repositories

import com.yassir.movies.domain.models.movieModel.MovieModel
import com.yassir.movies.domain.util.Resource

interface MovieRepository {

    suspend fun saveMovies(movies: MutableList<MovieModel>)
    suspend fun getSavedMovies(): MutableList<MovieModel>

    suspend fun getMoviesList (apikey:String): Resource<MutableList<MovieModel>>
}