package com.yassir.movies.presentation.utils

import com.yassir.movies.BuildConfig
import java.sql.Timestamp


object AppConstants {

    const val DARK_THEME = "dark_theme"
    const val LIGHT_THEME = "light_theme"
    const val DEFAULT_THEME = "default_theme"
     val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
}