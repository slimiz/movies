package com.yassir.movies.data.repositories.movieRemoteDataSource;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.yassir.movies.BuildConfig;
import com.yassir.movies.R;
import com.yassir.movies.data.mappers.MovieMapper;
import com.yassir.movies.data.remote.api.MovieApiService;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import com.yassir.movies.domain.util.Resource;
import com.yassir.movies.presentation.utils.NetworkUtil;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/yassir/movies/data/repositories/movieRemoteDataSource/MovieRemoteDataSourceImpl;", "Lcom/yassir/movies/data/repositories/movieRemoteDataSource/MovieRemoteDataSource;", "movieApiService", "Lcom/yassir/movies/data/remote/api/MovieApiService;", "movieMapper", "Lcom/yassir/movies/data/mappers/MovieMapper;", "context", "Landroid/content/Context;", "(Lcom/yassir/movies/data/remote/api/MovieApiService;Lcom/yassir/movies/data/mappers/MovieMapper;Landroid/content/Context;)V", "getMoviesList", "Lcom/yassir/movies/domain/util/Resource;", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "apikey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieRemoteDataSourceImpl implements com.yassir.movies.data.repositories.movieRemoteDataSource.MovieRemoteDataSource {
    private final com.yassir.movies.data.remote.api.MovieApiService movieApiService = null;
    private final com.yassir.movies.data.mappers.MovieMapper movieMapper = null;
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public MovieRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.remote.api.MovieApiService movieApiService, @org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.mappers.MovieMapper movieMapper, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMoviesList(@org.jetbrains.annotations.NotNull()
    java.lang.String apikey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yassir.movies.domain.util.Resource<java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel>>> continuation) {
        return null;
    }
}