package com.yassir.movies.data.repositories.movieLocalDataSource

import android.util.Log
import com.yassir.movies.data.local.dao.MoviesDao
import com.yassir.movies.data.mappers.MovieMapper
import com.yassir.movies.domain.models.movieModel.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class MovieLocalDataSourceImpl @Inject constructor(
    private val movieDao: MoviesDao,
    private val movieMapper: MovieMapper
): MovieLocalDataSource {

    override suspend fun saveMovies(movies: MutableList<MovieModel>) = withContext(Dispatchers.IO) {

        movieDao.saveMovies(movieMapper.toEntityList(movies) )
        }


    override suspend fun getSavedMovies(): MutableList<MovieModel> {
        val savedOrdersFlow = movieDao.getSavedMovies()
        return savedOrdersFlow.map { list ->

            movieMapper.mapFromEntity(list)

        }.toMutableList()

        }



}