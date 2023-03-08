package com.yassir.movies.data.repositories.movieRemoteDataSource;

import com.yassir.movies.domain.models.movieModel.MovieModel;
import com.yassir.movies.domain.util.Resource;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/yassir/movies/data/repositories/movieRemoteDataSource/MovieRemoteDataSource;", "", "getMoviesList", "Lcom/yassir/movies/domain/util/Resource;", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "apikey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface MovieRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMoviesList(@org.jetbrains.annotations.NotNull()
    java.lang.String apikey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yassir.movies.domain.util.Resource<java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>>> continuation);
}