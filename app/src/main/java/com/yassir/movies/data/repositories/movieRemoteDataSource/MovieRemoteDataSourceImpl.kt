package com.yassir.movies.data.repositories.movieRemoteDataSource


import android.content.Context
import android.content.res.Resources
import android.util.Log
import com.yassir.movies.BuildConfig

import com.yassir.movies.R
import com.yassir.movies.data.mappers.MovieMapper
import com.yassir.movies.data.remote.api.MovieApiService
import com.yassir.movies.domain.models.movieModel.MovieModel
import com.yassir.movies.domain.util.Resource
import com.yassir.movies.presentation.utils.NetworkUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieRemoteDataSourceImpl @Inject constructor(
    private val  movieApiService: MovieApiService,
    private val movieMapper: MovieMapper,
    private val context: Context
) : MovieRemoteDataSource {

    override suspend fun getMoviesList (apikey:String): Resource<MutableList<MovieModel>> {


        return if (NetworkUtil.isInternetAvailable(context)) {

            withContext(Dispatchers.IO) {

                try {
                    val response = movieApiService.getMoviesList(apikey)

                    if (response.isSuccessful) {

                         Resource.Success(movieMapper.fromDtoList(response.body()!!))
                    } else {

                         Resource.Error(
                            context.resources.getString(R.string.exeption) +
                                    "${response.message()} ${response.code()}"
                        )

                    }
                } catch (e: Exception) {

                     Resource.Error(
                        context.resources.getString(R.string.exeption)
                                + (e.localizedMessage ?: e.toString())
                    )
                }
            }
        } else {

             Resource.Error(
                context.resources.getString(R.string.no_internet)
            )

        }

    }

}


