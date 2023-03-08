package com.yassir.movies.presentation.ui.moviesList

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.yassir.movies.R
import com.yassir.movies.domain.models.movieModel.MovieModel
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class MoviesListFragmentDirections private constructor() {
  private data class ActionMovisListFragmentToMoviesDetailsFragment(
    public val selectedMovie: MovieModel? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_movisListFragment_to_moviesDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(MovieModel::class.java)) {
          result.putParcelable("selectedMovie", this.selectedMovie as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(MovieModel::class.java)) {
          result.putSerializable("selectedMovie", this.selectedMovie as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionMovisListFragmentToMoviesDetailsFragment(selectedMovie: MovieModel? = null):
        NavDirections = ActionMovisListFragmentToMoviesDetailsFragment(selectedMovie)
  }
}
