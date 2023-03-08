package com.yassir.movies.presentation.ui.moviesList;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.yassir.movies.domain.usecases.GetMovieListUseCase;
import com.yassir.movies.domain.util.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesList/MoviesListViewModel;", "Landroidx/lifecycle/ViewModel;", "getMoviesUseCase", "Lcom/yassir/movies/domain/usecases/GetMovieListUseCase;", "(Lcom/yassir/movies/domain/usecases/GetMovieListUseCase;)V", "_movieValue", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/yassir/movies/presentation/ui/moviesList/MovieListState;", "get_movieValue", "()Lkotlinx/coroutines/flow/StateFlow;", "movieValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOrders", "Lkotlinx/coroutines/Job;", "onCleared", "", "app_debug"})
public final class MoviesListViewModel extends androidx.lifecycle.ViewModel {
    private final com.yassir.movies.domain.usecases.GetMovieListUseCase getMoviesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.yassir.movies.presentation.ui.moviesList.MovieListState> movieValue = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.yassir.movies.presentation.ui.moviesList.MovieListState> _movieValue = null;
    
    @javax.inject.Inject()
    public MoviesListViewModel(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.domain.usecases.GetMovieListUseCase getMoviesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.yassir.movies.presentation.ui.moviesList.MovieListState> get_movieValue() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getOrders() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}