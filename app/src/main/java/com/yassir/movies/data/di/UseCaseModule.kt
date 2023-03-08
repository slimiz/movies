package com.yassir.movies.data.di

import com.yassir.movies.domain.repositories.MovieRepository
import com.yassir.movies.domain.usecases.GetMovieListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    fun provideGetMoviesUseCase(movieRepository: MovieRepository): GetMovieListUseCase
    {
        return GetMovieListUseCase(movieRepository)
    }
}