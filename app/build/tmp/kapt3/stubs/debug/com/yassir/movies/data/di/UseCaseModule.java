package com.yassir.movies.data.di;

import com.yassir.movies.domain.repositories.MovieRepository;
import com.yassir.movies.domain.usecases.GetMovieListUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/yassir/movies/data/di/UseCaseModule;", "", "()V", "provideGetMoviesUseCase", "Lcom/yassir/movies/domain/usecases/GetMovieListUseCase;", "movieRepository", "Lcom/yassir/movies/domain/repositories/MovieRepository;", "app_debug"})
@dagger.Module()
public final class UseCaseModule {
    
    public UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.yassir.movies.domain.usecases.GetMovieListUseCase provideGetMoviesUseCase(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.domain.repositories.MovieRepository movieRepository) {
        return null;
    }
}