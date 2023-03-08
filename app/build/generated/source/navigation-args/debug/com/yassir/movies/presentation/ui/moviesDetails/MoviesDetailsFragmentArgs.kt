package com.yassir.movies.presentation.ui.moviesDetails

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.yassir.movies.domain.models.movieModel.MovieModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class MoviesDetailsFragmentArgs(
  public val selectedMovie: MovieModel? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(MovieModel::class.java)) {
      result.putParcelable("selectedMovie", this.selectedMovie as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(MovieModel::class.java)) {
      result.putSerializable("selectedMovie", this.selectedMovie as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(MovieModel::class.java)) {
      result.set("selectedMovie", this.selectedMovie as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(MovieModel::class.java)) {
      result.set("selectedMovie", this.selectedMovie as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): MoviesDetailsFragmentArgs {
      bundle.setClassLoader(MoviesDetailsFragmentArgs::class.java.classLoader)
      val __selectedMovie : MovieModel?
      if (bundle.containsKey("selectedMovie")) {
        if (Parcelable::class.java.isAssignableFrom(MovieModel::class.java) ||
            Serializable::class.java.isAssignableFrom(MovieModel::class.java)) {
          __selectedMovie = bundle.get("selectedMovie") as MovieModel?
        } else {
          throw UnsupportedOperationException(MovieModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __selectedMovie = null
      }
      return MoviesDetailsFragmentArgs(__selectedMovie)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): MoviesDetailsFragmentArgs {
      val __selectedMovie : MovieModel?
      if (savedStateHandle.contains("selectedMovie")) {
        if (Parcelable::class.java.isAssignableFrom(MovieModel::class.java) ||
            Serializable::class.java.isAssignableFrom(MovieModel::class.java)) {
          __selectedMovie = savedStateHandle.get<MovieModel?>("selectedMovie")
        } else {
          throw UnsupportedOperationException(MovieModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __selectedMovie = null
      }
      return MoviesDetailsFragmentArgs(__selectedMovie)
    }
  }
}
