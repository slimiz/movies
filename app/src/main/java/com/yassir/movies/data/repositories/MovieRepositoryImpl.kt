package com.yassir.movies.data.repositories

import com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource
import com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource
import com.yassir.movies.domain.models.movieModel.MovieModel
import com.yassir.movies.domain.repositories.MovieRepository
import com.yassir.movies.domain.util.Resource
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieRemoteDataSource: MovieRemoteDataSource
) : MovieRepository {
    override suspend fun saveMovies(movies: MutableList<MovieModel>) {
        movieLocalDataSource.saveMovies(movies)
    }

    override suspend fun getSavedMovies(): MutableList<MovieModel> {
      return movieLocalDataSource.getSavedMovies()
    }



    override suspend fun getMoviesList (apikey:String): Resource<MutableList<MovieModel>> {
        return movieRemoteDataSource.getMoviesList (apikey)


    }
}