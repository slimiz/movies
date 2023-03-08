package com.yassir.movies.presentation.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yassir/movies/presentation/utils/NetworkUtil;", "", "()V", "isInternetAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
public final class NetworkUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.yassir.movies.presentation.utils.NetworkUtil INSTANCE = null;
    
    private NetworkUtil() {
        super();
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}