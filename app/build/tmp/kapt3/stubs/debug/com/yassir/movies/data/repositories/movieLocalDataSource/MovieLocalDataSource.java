package com.yassir.movies.data.repositories.movieLocalDataSource;

import com.yassir.movies.domain.models.movieModel.MovieModel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/yassir/movies/data/repositories/movieLocalDataSource/MovieLocalDataSource;", "", "getSavedMovies", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovies", "", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieLocalDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSavedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>> continuation);
}