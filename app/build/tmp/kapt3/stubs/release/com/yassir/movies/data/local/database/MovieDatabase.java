package com.yassir.movies.data.local.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.yassir.movies.data.local.converter.Converters;
import com.yassir.movies.data.local.dao.MoviesDao;
import com.yassir.movies.data.local.entity.MovieEntity;

/**
 * Created by Slim aloui on 07/03/2023
 */
@androidx.room.TypeConverters(value = {com.yassir.movies.data.local.converter.Converters.class})
@androidx.room.Database(entities = {com.yassir.movies.data.local.entity.MovieEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/yassir/movies/data/local/database/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/yassir/movies/data/local/dao/MoviesDao;", "app_release"})
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    
    public MovieDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.yassir.movies.data.local.dao.MoviesDao movieDao();
}