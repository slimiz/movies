package com.yassir.movies.presentation.ui.moviesList;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.yassir.movies.BuildConfig;
import com.yassir.movies.domain.models.movieModel.MovieModel;
import com.yassir.movies.databinding.MovieItemBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter$OrdersViewHolder;", "listener", "Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter$ActionClickListener;", "(Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter$ActionClickListener;)V", "binding", "Lcom/yassir/movies/databinding/MovieItemBinding;", "moviessList", "", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOrderList", "updatedOrderDetailsList", "ActionClickListener", "OrdersViewHolder", "app_release"})
public final class MoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.yassir.movies.presentation.ui.moviesList.MoviesAdapter.OrdersViewHolder> {
    private final com.yassir.movies.presentation.ui.moviesList.MoviesAdapter.ActionClickListener listener = null;
    private com.yassir.movies.databinding.MovieItemBinding binding;
    private final java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> moviessList = null;
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.presentation.ui.moviesList.MoviesAdapter.ActionClickListener listener) {
        super();
    }
    
    public final void setOrderList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.yassir.movies.domain.models.movieModel.MovieModel> updatedOrderDetailsList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.yassir.movies.presentation.ui.moviesList.MoviesAdapter.OrdersViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.yassir.movies.presentation.ui.moviesList.MoviesAdapter.OrdersViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter$OrdersViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/yassir/movies/databinding/MovieItemBinding;", "(Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter;Lcom/yassir/movies/databinding/MovieItemBinding;)V", "bind", "", "movieModel", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "app_release"})
    public final class OrdersViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.yassir.movies.databinding.MovieItemBinding binding = null;
        
        public OrdersViewHolder(@org.jetbrains.annotations.NotNull()
        com.yassir.movies.databinding.MovieItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.yassir.movies.domain.models.movieModel.MovieModel movieModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesList/MoviesAdapter$ActionClickListener;", "", "navigateToDetails", "", "movie", "Lcom/yassir/movies/domain/models/movieModel/MovieModel;", "app_release"})
    public static abstract interface ActionClickListener {
        
        public abstract void navigateToDetails(@org.jetbrains.annotations.NotNull()
        com.yassir.movies.domain.models.movieModel.MovieModel movie);
    }
}