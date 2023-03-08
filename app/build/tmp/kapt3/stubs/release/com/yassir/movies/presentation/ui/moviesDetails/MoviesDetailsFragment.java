package com.yassir.movies.presentation.ui.moviesDetails;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.yassir.movies.BuildConfig;
import com.yassir.movies.R;
import com.yassir.movies.databinding.FragmentMoviesDetailsBinding;
import dagger.hilt.android.AndroidEntryPoint;

/**
 * A simple [Fragment] subclass.
 * Use the [MoviesDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J&\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesDetails/MoviesDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/yassir/movies/presentation/ui/moviesDetails/MoviesDetailsFragmentArgs;", "getArgs", "()Lcom/yassir/movies/presentation/ui/moviesDetails/MoviesDetailsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/yassir/movies/databinding/FragmentMoviesDetailsBinding;", "rootView", "Landroid/view/View;", "disableAutoScrollToBottom", "", "scrollView", "Landroid/widget/ScrollView;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupUI", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MoviesDetailsFragment extends androidx.fragment.app.Fragment {
    private com.yassir.movies.databinding.FragmentMoviesDetailsBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private android.view.View rootView;
    
    public MoviesDetailsFragment() {
        super();
    }
    
    private final com.yassir.movies.presentation.ui.moviesDetails.MoviesDetailsFragmentArgs getArgs() {
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
    
    private final void setupUI() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void disableAutoScrollToBottom(android.widget.ScrollView scrollView) {
    }
}