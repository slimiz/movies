// Generated by Dagger (https://dagger.dev).
package com.yassir.movies.presentation.ui.moviesList;

import com.yassir.movies.domain.usecases.GetMovieListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class MoviesListViewModel_Factory implements Factory<MoviesListViewModel> {
  private final Provider<GetMovieListUseCase> getMoviesUseCaseProvider;

  public MoviesListViewModel_Factory(Provider<GetMovieListUseCase> getMoviesUseCaseProvider) {
    this.getMoviesUseCaseProvider = getMoviesUseCaseProvider;
  }

  @Override
  public MoviesListViewModel get() {
    return newInstance(getMoviesUseCaseProvider.get());
  }

  public static MoviesListViewModel_Factory create(
      Provider<GetMovieListUseCase> getMoviesUseCaseProvider) {
    return new MoviesListViewModel_Factory(getMoviesUseCaseProvider);
  }

  public static MoviesListViewModel newInstance(GetMovieListUseCase getMoviesUseCase) {
    return new MoviesListViewModel(getMoviesUseCase);
  }
}