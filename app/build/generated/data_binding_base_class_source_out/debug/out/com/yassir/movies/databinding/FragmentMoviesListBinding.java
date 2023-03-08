// Generated by data binding compiler. Do not edit!
package com.yassir.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.yassir.movies.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMoviesListBinding extends ViewDataBinding {
  @NonNull
  public final TextView noSearchResultsFound;

  @NonNull
  public final ProgressBar progressBarMovie;

  @NonNull
  public final RecyclerView recyclerViewMovie;

  @NonNull
  public final SearchHeaderLayoutBinding searchBoxContainer;

  protected FragmentMoviesListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView noSearchResultsFound, ProgressBar progressBarMovie, RecyclerView recyclerViewMovie,
      SearchHeaderLayoutBinding searchBoxContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.noSearchResultsFound = noSearchResultsFound;
    this.progressBarMovie = progressBarMovie;
    this.recyclerViewMovie = recyclerViewMovie;
    this.searchBoxContainer = searchBoxContainer;
  }

  @NonNull
  public static FragmentMoviesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_movies_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMoviesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMoviesListBinding>inflateInternal(inflater, R.layout.fragment_movies_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMoviesListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_movies_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMoviesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMoviesListBinding>inflateInternal(inflater, R.layout.fragment_movies_list, null, false, component);
  }

  public static FragmentMoviesListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentMoviesListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentMoviesListBinding)bind(component, view, R.layout.fragment_movies_list);
  }
}