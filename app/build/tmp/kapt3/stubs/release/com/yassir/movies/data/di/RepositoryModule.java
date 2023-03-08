package com.yassir.movies.data.di;

import android.content.Context;
import com.yassir.movies.data.local.dao.MoviesDao;
import com.yassir.movies.data.mappers.MovieMapper;
import com.yassir.movies.data.remote.api.MovieApiService;
import com.yassir.movies.data.repositories.MovieRepositoryImpl;
import com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource;
import com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSourceImpl;
import com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource;
import com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSourceImpl;
import com.yassir.movies.domain.repositories.MovieRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/yassir/movies/data/di/RepositoryModule;", "", "()V", "provideMovieLocalDataSource", "Lcom/yassir/movies/data/repositories/movieLocalDataSource/MovieLocalDataSource;", "movieDao", "Lcom/yassir/movies/data/local/dao/MoviesDao;", "movieMapper", "Lcom/yassir/movies/data/mappers/MovieMapper;", "provideMovieRemoteDataSource", "Lcom/yassir/movies/data/repositories/movieRemoteDataSource/MovieRemoteDataSource;", "movieApiService", "Lcom/yassir/movies/data/remote/api/MovieApiService;", "context", "Landroid/content/Context;", "provideMovieRepository", "Lcom/yassir/movies/domain/repositories/MovieRepository;", "movieLocalDataSource", "movieRemoteDataSource", "app_release"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource provideMovieRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.remote.api.MovieApiService movieApiService, @org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.mappers.MovieMapper movieMapper, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource provideMovieLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.local.dao.MoviesDao movieDao, @org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.mappers.MovieMapper movieMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yassir.movies.domain.repositories.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource movieLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource movieRemoteDataSource) {
        return null;
    }
}