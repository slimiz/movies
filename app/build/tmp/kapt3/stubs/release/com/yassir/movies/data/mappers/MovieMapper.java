package com.yassir.movies.data.mappers;

import com.yassir.movies.data.local.entity.MovieEntity;
import com.yassir.movies.data.remote.dto.MovieResponse;
import com.yassir.movies.data.remote.dto.Movie;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006J\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/yassir/movies/data/mappers/MovieMapper;", "Lcom/yassir/movies/data/mappers/EntityMapper;", "Lcom/yassir/movies/data/local/entity/MovieEntity;", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "()V", "fromDtoList", "", "initial", "Lcom/yassir/movies/data/remote/dto/MovieResponse;", "fromEntityList", "mapFromDto", "response", "Lcom/yassir/movies/data/remote/dto/Movie;", "mapFromEntity", "entity", "mapToDto", "model", "mapToEntity", "toDtoList", "toEntityList", "app_release"})
public final class MovieMapper implements com.yassir.movies.data.mappers.EntityMapper<com.yassir.movies.data.local.entity.MovieEntity, com.yassir.movies.domain.models.movieModel.MovieModel> {
    
    @javax.inject.Inject()
    public MovieMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yassir.movies.domain.models.movieModel.MovieModel mapFromEntity(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.local.entity.MovieEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yassir.movies.data.local.entity.MovieEntity mapToEntity(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.domain.models.movieModel.MovieModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> fromEntityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.data.local.entity.MovieEntity> initial) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yassir.movies.data.local.entity.MovieEntity> toEntityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> initial) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yassir.movies.domain.models.movieModel.MovieModel mapFromDto(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.remote.dto.Movie response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yassir.movies.data.remote.dto.Movie mapToDto(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.domain.models.movieModel.MovieModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> fromDtoList(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.data.remote.dto.MovieResponse initial) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.yassir.movies.data.remote.dto.Movie> toDtoList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> initial) {
        return null;
    }
}