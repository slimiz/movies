package com.yassir.movies.presentation.ui.moviesDetails

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yassir.movies.BuildConfig
import com.yassir.movies.R
import com.yassir.movies.databinding.FragmentMoviesDetailsBinding
import dagger.hilt.android.AndroidEntryPoint


/**
 * A simple [Fragment] subclass.
 * Use the [MoviesDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

@AndroidEntryPoint
class MoviesDetailsFragment : Fragment() {

    private lateinit var binding: FragmentMoviesDetailsBinding
    private val args: MoviesDetailsFragmentArgs by navArgs()
    private  lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_movies_details,container,false);
        rootView=binding.root;

        setupUI()

        return rootView
    }

    private fun setupUI() {

        binding.tvHeading.text = args.selectedMovie!!.title
        binding.tvDescription.text = args.selectedMovie!!.description
        Glide.with(requireActivity())
            .load(BuildConfig.IMAGE_BASE+ args.selectedMovie!!.image)
            .apply(RequestOptions.centerCropTransform())
            .into(binding.ivHeading)

        disableAutoScrollToBottom(binding.scroll)
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun disableAutoScrollToBottom(scrollView: ScrollView) {

        scrollView.descendantFocusability = ViewGroup.FOCUS_BEFORE_DESCENDANTS
        scrollView.isFocusable = true
        scrollView.isFocusableInTouchMode = true
        scrollView.setOnTouchListener { arg0, arg1 ->
            arg0.requestFocusFromTouch()
            false
        }
    }
}


