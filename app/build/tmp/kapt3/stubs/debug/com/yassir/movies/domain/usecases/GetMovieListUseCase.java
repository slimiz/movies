package com.yassir.movies.domain.usecases;

import android.annotation.SuppressLint;
import android.util.Log;
import com.yassir.movies.BuildConfig;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import com.yassir.movies.domain.repositories.MovieRepository;
import com.yassir.movies.domain.util.Resource;
import com.yassir.movies.presentation.utils.NetworkUtil;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u000bH\u0087B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/yassir/movies/domain/usecases/GetMovieListUseCase;", "", "movieRepository", "Lcom/yassir/movies/domain/repositories/MovieRepository;", "(Lcom/yassir/movies/domain/repositories/MovieRepository;)V", "networkOrders", "Lcom/yassir/movies/domain/util/Resource;", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "savedOrders", "invoke", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetMovieListUseCase {
    private final com.yassir.movies.domain.repositories.MovieRepository movieRepository = null;
    private java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> savedOrders;
    private com.yassir.movies.domain.util.Resource<java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>> networkOrders;
    
    @javax.inject.Inject()
    public GetMovieListUseCase(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.domain.repositories.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.yassir.movies.domain.util.Resource<java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>>>> continuation) {
        return null;
    }
}