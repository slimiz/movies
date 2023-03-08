// Generated by Dagger (https://dagger.dev).
package com.yassir.movies.data.di;

import com.yassir.movies.domain.repositories.MovieRepository;
import com.yassir.movies.domain.usecases.GetMovieListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UseCaseModule_ProvideGetMoviesUseCaseFactory implements Factory<GetMovieListUseCase> {
  private final UseCaseModule module;

  private final Provider<MovieRepository> movieRepositoryProvider;

  public UseCaseModule_ProvideGetMoviesUseCaseFactory(UseCaseModule module,
      Provider<MovieRepository> movieRepositoryProvider) {
    this.module = module;
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public GetMovieListUseCase get() {
    return provideGetMoviesUseCase(module, movieRepositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetMoviesUseCaseFactory create(UseCaseModule module,
      Provider<MovieRepository> movieRepositoryProvider) {
    return new UseCaseModule_ProvideGetMoviesUseCaseFactory(module, movieRepositoryProvider);
  }

  public static GetMovieListUseCase provideGetMoviesUseCase(UseCaseModule instance,
      MovieRepository movieRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetMoviesUseCase(movieRepository));
  }
}
