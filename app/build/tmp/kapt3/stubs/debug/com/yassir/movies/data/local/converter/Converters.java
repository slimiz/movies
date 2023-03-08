package com.yassir.movies.data.local.converter;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.yassir.movies.data.local.entity.MovieEntity;
import com.yassir.movies.data.remote.dto.Movie;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/yassir/movies/data/local/converter/Converters;", "", "()V", "jsonStringToList", "", "Lcom/yassir/movies/data/remote/dto/Movie;", "value", "", "listToJsonString", "", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String listToJsonString(@org.jetbrains.annotations.Nullable()
    java.util.List<com.yassir.movies.data.remote.dto.Movie> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<com.yassir.movies.data.remote.dto.Movie> jsonStringToList(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}