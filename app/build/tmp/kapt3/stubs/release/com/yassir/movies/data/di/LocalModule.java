package com.yassir.movies.data.di;

import android.content.Context;
import androidx.room.Room;
import com.yassir.movies.data.local.dao.MoviesDao;
import com.yassir.movies.data.local.database.MovieDatabase;
import com.yassir.movies.data.local.entity.MovieEntity;
import com.yassir.movies.data.mappers.EntityMapper;
import com.yassir.movies.data.mappers.MovieMapper;
import com.yassir.movies.data.util.DataConstants;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/yassir/movies/data/di/LocalModule;", "", "()V", "provideDatabase", "Lcom/yassir/movies/data/local/database/MovieDatabase;", "context", "Landroid/content/Context;", "provideOrderMapper", "Lcom/yassir/movies/data/mappers/EntityMapper;", "Lcom/yassir/movies/data/local/entity/MovieEntity;", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "provideOrdersDao", "Lcom/yassir/movies/data/local/dao/MoviesDao;", "appDatabase", "app_release"})
@dagger.Module()
public final class LocalModule {
    
    public LocalModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.yassir.movies.data.local.database.MovieDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.yassir.movies.data.mappers.EntityMapper<com.yassir.movies.data.local.entity.MovieEntity, com.yassir.movies.domain.models.movieModel.MovieModel> provideOrderMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.yassir.movies.data.local.dao.MoviesDao provideOrdersDao(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.local.database.MovieDatabase appDatabase) {
        return null;
    }
}