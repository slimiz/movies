package com.yassir.movies.data.di

import android.content.Context
import com.yassir.movies.data.local.dao.MoviesDao
import com.yassir.movies.data.mappers.MovieMapper
import com.yassir.movies.data.remote.api.MovieApiService
import com.yassir.movies.data.repositories.MovieRepositoryImpl
import com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource
import com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSourceImpl
import com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource
import com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSourceImpl
import com.yassir.movies.domain.repositories.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {


    @Provides
    fun provideMovieRemoteDataSource(
        movieApiService: MovieApiService,
        movieMapper: MovieMapper,
        @ApplicationContext context: Context
    ): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(movieApiService,movieMapper,context)
    }

    @Provides
    fun provideMovieLocalDataSource(
        movieDao: MoviesDao,
        movieMapper: MovieMapper
    ): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao,movieMapper)
    }

    @Provides
    fun provideMovieRepository(
        movieLocalDataSource: MovieLocalDataSource,
        movieRemoteDataSource: MovieRemoteDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieLocalDataSource,movieRemoteDataSource)
    }

}