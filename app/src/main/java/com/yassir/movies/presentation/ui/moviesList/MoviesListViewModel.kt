package com.yassir.movies.presentation.ui.moviesList

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yassir.movies.domain.usecases.GetMovieListUseCase
import com.yassir.movies.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesListViewModel @Inject constructor(
    private val getMoviesUseCase: GetMovieListUseCase
):ViewModel()


{
    private val movieValue = MutableStateFlow<MovieListState>(MovieListState())
    val _movieValue : StateFlow<MovieListState> = movieValue

    init {
        getOrders()
    }


    private fun getOrders()=viewModelScope.launch(Dispatchers.IO){
        getMoviesUseCase.invoke()
            .catch {

                movieValue.value = MovieListState(error ="An Unexpected Error")
            }
            .collect {
            when(it){
                is Resource.Success ->{
                    movieValue.value = MovieListState(moviesList = it.data?: mutableListOf())

                }
                is Resource.Loading ->{
                    movieValue.value = MovieListState(isLoading = true)

                }
                is Resource.Error ->{

                    movieValue.value = MovieListState(error = it.message?:"An Unexpected Error")

                }
            }
        }

    }


    override fun onCleared() {
        super.onCleared()
    }
}