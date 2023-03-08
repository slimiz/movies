package com.yassir.movies.domain.usecases

import android.annotation.SuppressLint
import android.util.Log
import com.yassir.movies.BuildConfig
import com.yassir.movies.domain.models.movieModel.MovieModel
import com.yassir.movies.domain.repositories.MovieRepository
import com.yassir.movies.domain.util.Resource
import com.yassir.movies.presentation.utils.NetworkUtil
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository)


{
//    suspend  operator fun invoke () = foodRepository.getOrders()

    private lateinit var savedOrders: MutableList<MovieModel>
    private lateinit var networkOrders: Resource<MutableList<MovieModel>>

    @SuppressLint("SuspiciousIndentation")
    suspend operator fun invoke(): Flow<Resource<MutableList<MovieModel>>> = flow {

        try {
        emit(Resource.Loading())

        delay(1000)

             savedOrders = movieRepository.getSavedMovies()

            if(savedOrders.isNotEmpty())
            {
                emit(Resource.Success(savedOrders))
            }

            else{

                 networkOrders = movieRepository.getMoviesList(BuildConfig.API_KEY)

                if(networkOrders.data!=null)
                {
                    movieRepository.saveMovies(networkOrders.data!!)
                    savedOrders = movieRepository.getSavedMovies()

                    emit(Resource.Success(savedOrders))
                }

                else
                {
                    emit(Resource.Error(networkOrders.message!!))
                }

            }


        } catch (e: Exception) {
            emit(Resource.Error(e.toString()))
        }
    }


}