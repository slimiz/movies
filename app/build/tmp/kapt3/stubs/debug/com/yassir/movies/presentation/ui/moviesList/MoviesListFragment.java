package com.yassir.movies.presentation.ui.moviesList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import com.yassir.movies.R;
import com.yassir.movies.databinding.FragmentMoviesListBinding;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.Dispatchers;
import java.util.*;
import kotlin.collections.ArrayList;

/**
 * A simple [Fragment] subclass.
 * Use the [MoviesListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\"\u001a\u00020\u00132\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesList/MoviesListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/yassir/movies/databinding/FragmentMoviesListBinding;", "moviesAdapter", "Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter;", "moviesList", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "moviesViewModel", "Lcom/yassir/movies/presentation/ui/moviesList/MoviesListViewModel;", "getMoviesViewModel", "()Lcom/yassir/movies/presentation/ui/moviesList/MoviesListViewModel;", "moviesViewModel$delegate", "Lkotlin/Lazy;", "rootView", "Landroid/view/View;", "filterWithQuery", "", "query", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onQueryChanged", "filterQuery", "setupObserver", "setupUI", "toggleImageView", "toggleRecyclerView", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MoviesListFragment extends androidx.fragment.app.Fragment {
    private java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> moviesList;
    private com.yassir.movies.databinding.FragmentMoviesListBinding binding;
    private com.yassir.movies.presentation.ui.moviesList.MoviesAdapter moviesAdapter;
    private final kotlin.Lazy moviesViewModel$delegate = null;
    private android.view.View rootView;
    
    public MoviesListFragment() {
        super();
    }
    
    private final com.yassir.movies.presentation.ui.moviesList.MoviesListViewModel getMoviesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void filterWithQuery(java.lang.String query) {
    }
    
    private final java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> onQueryChanged(java.lang.String filterQuery) {
        return null;
    }
    
    private final void toggleRecyclerView(java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> moviesList) {
    }
    
    private final void toggleImageView(java.lang.String query) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupObserver() {
    }
}