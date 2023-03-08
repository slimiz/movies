package com.yassir.movies.presentation.ui.moviesList;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.yassir.movies.R;
import com.yassir.movies.databinding.ActivityHomeBinding;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/yassir/movies/presentation/ui/moviesList/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "Lcom/yassir/movies/databinding/ActivityHomeBinding;", "navController", "Landroidx/navigation/NavController;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupNavigation", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    private com.yassir.movies.databinding.ActivityHomeBinding binding;
    private androidx.navigation.NavController navController;
    
    public HomeActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupNavigation() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}