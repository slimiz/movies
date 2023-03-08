package com.yassir.movies.presentation.ui.moviesList

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.yassir.movies.domain.models.movieModel.MovieModel
import com.yassir.movies.R
import com.yassir.movies.databinding.FragmentMoviesListBinding

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList


/**
 * A simple [Fragment] subclass.
 * Use the [MoviesListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

@AndroidEntryPoint
class MoviesListFragment : Fragment() {
    private lateinit var moviesList: MutableList<MovieModel>
    private lateinit var binding: FragmentMoviesListBinding
    private lateinit var moviesAdapter:MoviesAdapter
    private val moviesViewModel : MoviesListViewModel by viewModels()
    private  lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_movies_list,container,false);
        rootView=binding.root;

        setupUI()
        setupObserver()


        moviesAdapter = MoviesAdapter( object : MoviesAdapter.ActionClickListener {
            @SuppressLint("SuspiciousIndentation")
            override fun navigateToDetails(movie: MovieModel) {
              val direction = MoviesListFragmentDirections.actionMovisListFragmentToMoviesDetailsFragment(movie)
                findNavController().navigate(direction)
            }


        })



        binding.searchBoxContainer.edtSearchMovie.doOnTextChanged { text, _, _, _ ->
            val query = text.toString().lowercase(Locale.getDefault())
            filterWithQuery(query)
            toggleImageView(query)
        }



        binding.searchBoxContainer.clearSearchQuery.setOnClickListener {
            binding.searchBoxContainer.edtSearchMovie.setText("")
            moviesAdapter.setOrderList(moviesList)
            binding.recyclerViewMovie.visibility = View.VISIBLE
            binding.noSearchResultsFound.visibility = View.GONE
        }

        return rootView
    }



    private fun filterWithQuery(query: String) {
        if (query.isNotEmpty()) {
            val filteredList: MutableList<MovieModel> = onQueryChanged(query)
            moviesAdapter.setOrderList(filteredList)
            toggleRecyclerView(filteredList)
        } else if (query.isEmpty()) {
            moviesAdapter.setOrderList(moviesList)
        }
    }

    private fun onQueryChanged(filterQuery: String): MutableList<MovieModel> {
        val filteredList = ArrayList<MovieModel>()
        for (currentMoviet in moviesList) {
            if (currentMoviet.title!!.lowercase(Locale.getDefault()).contains(filterQuery)) {
                filteredList.add(currentMoviet)
            }
        }
        return filteredList
    }



    private fun toggleRecyclerView(moviesList: List<MovieModel>) {
        if (moviesList.isEmpty()) {
            binding.recyclerViewMovie.visibility = View.GONE
            binding.noSearchResultsFound.visibility = View.VISIBLE
        } else {
            binding.recyclerViewMovie.visibility = View.VISIBLE
            binding.noSearchResultsFound.visibility = View.GONE
        }
    }

    private fun toggleImageView(query: String) {
        if (query.isNotEmpty()) {
            binding.searchBoxContainer.clearSearchQuery.visibility = View.VISIBLE

        } else if (query.isEmpty()) {
            binding.searchBoxContainer.clearSearchQuery.visibility = View.GONE

        }
    }

    private fun setupUI() {

        val layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewMovie.layoutManager = layoutManager
        binding.recyclerViewMovie.setHasFixedSize(true)



    }

    private  fun setupObserver(){
        CoroutineScope(Dispatchers.Main).launch {
                moviesViewModel._movieValue.collect{value->
                    when {
                        value.isLoading -> {
                            binding.progressBarMovie.visibility = View.VISIBLE
                        }
                        value.error.isNotBlank() -> {
                            binding.progressBarMovie.visibility = View.GONE
                            binding.recyclerViewMovie.visibility = View.GONE
                            binding.noSearchResultsFound.visibility = View.VISIBLE
                            Toast.makeText(requireContext(), value.error, Toast.LENGTH_LONG).show()
                        }
                        value.moviesList.isNotEmpty() -> {
                            binding.progressBarMovie.visibility = View.GONE

                            moviesAdapter.setOrderList(value.moviesList)

                            binding.recyclerViewMovie.adapter = moviesAdapter
                            moviesList = value.moviesList
                        }
                    }

                }

    }
}

}

