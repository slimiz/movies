package com.yassir.movies.data.di


import android.content.Context
import androidx.room.Room
import com.yassir.movies.data.local.dao.MoviesDao
import com.yassir.movies.data.local.database.MovieDatabase
import com.yassir.movies.data.local.entity.MovieEntity
import com.yassir.movies.data.mappers.EntityMapper
import com.yassir.movies.data.mappers.MovieMapper
import com.yassir.movies.data.util.DataConstants
import com.yassir.movies.domain.models.movieModel.MovieModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): MovieDatabase {
        return Room.databaseBuilder(context, MovieDatabase::class.java, DataConstants.DB_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieMapper(): EntityMapper<MovieEntity, MovieModel> {
        return MovieMapper()
    }


    @Provides
    @Singleton
    fun provideMovieDao(appDatabase: MovieDatabase): MoviesDao {
        return appDatabase.movieDao()
    }

}

