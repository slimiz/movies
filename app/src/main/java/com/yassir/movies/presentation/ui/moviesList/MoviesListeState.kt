package com.yassir.movies.presentation.ui.moviesList

import com.yassir.movies.domain.models.movieModel.MovieModel


data class MovieListState(
    val isLoading : Boolean = false,
    val moviesList : MutableList<MovieModel> = mutableListOf(),
    val error : String = ""
)