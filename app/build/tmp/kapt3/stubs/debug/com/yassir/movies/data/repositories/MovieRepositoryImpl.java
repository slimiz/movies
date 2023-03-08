package com.yassir.movies.data.repositories;

import com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource;
import com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import com.yassir.movies.domain.repositories.MovieRepository;
import com.yassir.movies.domain.util.Resource;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/yassir/movies/data/repositories/MovieRepositoryImpl;", "Lcom/yassir/movies/domain/repositories/MovieRepository;", "movieLocalDataSource", "Lcom/yassir/movies/data/repositories/movieLocalDataSource/MovieLocalDataSource;", "movieRemoteDataSource", "Lcom/yassir/movies/data/repositories/movieRemoteDataSource/MovieRemoteDataSource;", "(Lcom/yassir/movies/data/repositories/movieLocalDataSource/MovieLocalDataSource;Lcom/yassir/movies/data/repositories/movieRemoteDataSource/MovieRemoteDataSource;)V", "getMoviesList", "Lcom/yassir/movies/domain/util/Resource;", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "apikey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedMovies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovies", "", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieRepositoryImpl implements com.yassir.movies.domain.repositories.MovieRepository {
    private final com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource movieLocalDataSource = null;
    private final com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource movieRemoteDataSource = null;
    
    @javax.inject.Inject()
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.repositories.movieLocalDataSource.MovieLocalDataSource movieLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource movieRemoteDataSource) {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMoviesList(@org.jetbrains.annotations.NotNull()
    java.lang.String apikey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yassir.movies.domain.util.Resource<java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>>> continuation) {
        return null;
    }
}