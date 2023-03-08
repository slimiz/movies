package com.yassir.movies.data.repositories.movieRemoteDataSource

import com.yassir.movies.domain.models.movieModel.MovieModel
import com.yassir.movies.domain.util.Resource

interface MovieRemoteDataSource {
    suspend fun getMoviesList (apikey:String): Resource<MutableList<MovieModel>>
}