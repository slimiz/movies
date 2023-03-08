package com.yassir.movies;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.yassir.movies.databinding.ActivityHomeBindingImpl;
import com.yassir.movies.databinding.FragmentMoviesDetailsBindingImpl;
import com.yassir.movies.databinding.FragmentMoviesListBindingImpl;
import com.yassir.movies.databinding.MovieItemBindingImpl;
import com.yassir.movies.databinding.NavHeaderToolbarBindingImpl;
import com.yassir.movies.databinding.SearchHeaderLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_FRAGMENTMOVIESDETAILS = 2;

  private static final int LAYOUT_FRAGMENTMOVIESLIST = 3;

  private static final int LAYOUT_MOVIEITEM = 4;

  private static final int LAYOUT_NAVHEADERTOOLBAR = 5;

  private static final int LAYOUT_SEARCHHEADERLAYOUT = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassir.movies.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassir.movies.R.layout.fragment_movies_details, LAYOUT_FRAGMENTMOVIESDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassir.movies.R.layout.fragment_movies_list, LAYOUT_FRAGMENTMOVIESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassir.movies.R.layout.movie_item, LAYOUT_MOVIEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassir.movies.R.layout.nav_header_toolbar, LAYOUT_NAVHEADERTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.yassir.movies.R.layout.search_header_layout, LAYOUT_SEARCHHEADERLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIESDETAILS: {
          if ("layout/fragment_movies_details_0".equals(tag)) {
            return new FragmentMoviesDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movies_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIESLIST: {
          if ("layout/fragment_movies_list_0".equals(tag)) {
            return new FragmentMoviesListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movies_list is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIEITEM: {
          if ("layout/movie_item_0".equals(tag)) {
            return new MovieItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERTOOLBAR: {
          if ("layout/nav_header_toolbar_0".equals(tag)) {
            return new NavHeaderToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHHEADERLAYOUT: {
          if ("layout/search_header_layout_0".equals(tag)) {
            return new SearchHeaderLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_header_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "movieModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_home_0", com.yassir.movies.R.layout.activity_home);
      sKeys.put("layout/fragment_movies_details_0", com.yassir.movies.R.layout.fragment_movies_details);
      sKeys.put("layout/fragment_movies_list_0", com.yassir.movies.R.layout.fragment_movies_list);
      sKeys.put("layout/movie_item_0", com.yassir.movies.R.layout.movie_item);
      sKeys.put("layout/nav_header_toolbar_0", com.yassir.movies.R.layout.nav_header_toolbar);
      sKeys.put("layout/search_header_layout_0", com.yassir.movies.R.layout.search_header_layout);
    }
  }
}
