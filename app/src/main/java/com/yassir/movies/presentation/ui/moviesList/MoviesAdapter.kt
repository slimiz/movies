package com.yassir.movies.presentation.ui.moviesList

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yassir.movies.BuildConfig
import com.yassir.movies.domain.models.movieModel.MovieModel

import com.yassir.movies.databinding.MovieItemBinding

class MoviesAdapter (private val listener: ActionClickListener
): RecyclerView.Adapter<MoviesAdapter.OrdersViewHolder>() {

    private lateinit var binding: MovieItemBinding
    private val moviessList: MutableList<MovieModel> = mutableListOf()

    fun setOrderList(updatedOrderDetailsList: MutableList<MovieModel>) {
        val diffResult = DiffUtil.calculateDiff(MoviesListDiffUtilCallback(moviessList, updatedOrderDetailsList))


        moviessList.clear()
        moviessList.addAll(updatedOrderDetailsList)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrdersViewHolder {

        binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OrdersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrdersViewHolder, position: Int) {

        val movies = moviessList[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int {
        return moviessList.size
    }
    inner class OrdersViewHolder( private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(movieModel: MovieModel) {
            binding.movieModel = movieModel

            binding.root.setOnClickListener {
                listener.navigateToDetails(movieModel)
            }

            binding.let {
                binding.imMoviePoster.let { image ->
                    Glide.with(it.root)
                        .load(BuildConfig.IMAGE_BASE+movieModel.image)
                        .apply(RequestOptions.centerCropTransform())
                        .into(image)
                }
            }
        }


    }
    interface ActionClickListener {
        fun navigateToDetails(movie: MovieModel)
    }
}




//difutils
//https://www.howtodoandroid.com/update-android-recyclerview-using-diffutil/