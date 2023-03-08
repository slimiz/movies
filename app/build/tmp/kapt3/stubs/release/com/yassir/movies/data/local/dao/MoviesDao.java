package com.yassir.movies.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.yassir.movies.data.local.entity.MovieEntity;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/yassir/movies/data/local/dao/MoviesDao;", "", "getSavedMovies", "", "Lcom/yassir/movies/data/local/entity/MovieEntity;", "saveMovies", "", "orders", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface MoviesDao {
    
    /**
     * Insert all movies.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object saveMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.data.local.entity.MovieEntity> orders, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Get saved movie.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movies ")
    public abstract java.util.List<com.yassir.movies.data.local.entity.MovieEntity> getSavedMovies();
}