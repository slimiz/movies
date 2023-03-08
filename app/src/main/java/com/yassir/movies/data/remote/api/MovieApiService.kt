package com.yassir.movies.data.remote.api

import com.yassir.movies.data.remote.dto.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApiService {

    @GET("/3/discover/movie")
    suspend fun getMoviesList(@Query("api_key") api_key: String): Response<MovieResponse>



}