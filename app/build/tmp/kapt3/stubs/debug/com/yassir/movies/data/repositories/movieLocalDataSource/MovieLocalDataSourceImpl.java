package com.yassir.movies.data.repositories.movieLocalDataSource;

import android.util.Log;
import com.yassir.movies.data.local.dao.MoviesDao;
import com.yassir.movies.data.mappers.MovieMapper;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/yassir/movies/data/repositories/movieLocalDataSource/MovieLocalDataSourceImpl;", "Lcom/yassir/movies/data/repositories/movieLocalDataSource/MovieLocalDataSource;", "movieDao", "Lcom/yassir/movies/data/local/dao/MoviesDao;", "movieMapper", "Lcom/yassir/movies/data/mappers/MovieMapper;", "(Lcom/yassir/movies/data/local/dao/MoviesDao;Lcom/yassir/movies/data/mappers/MovieMapper;)V", "getSavedMovies", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovies", "", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieLocalDataSourceImpl implements com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource {
    private final com.yassir.movies.data.local.dao.MoviesDao movieDao = null;
    private final com.yassir.movies.data.mappers.MovieMapper movieMapper = null;
    
    @javax.inject.Inject()
    public MovieLocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.local.dao.MoviesDao movieDao, @org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.mappers.MovieMapper movieMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSavedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>> continuation) {
        return null;
    }
}