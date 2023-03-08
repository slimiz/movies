package com.yassir.movies.domain.util

/**
 * A generic class that holds a value or an error status.
 * @param <T>
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
    class Loading<T>(val isLoading: Boolean = true): Resource<T>(null)



   /* package com.ngallazzi.domain.common

    *//**
     * A generic class that holds a value or an error status.
     * @param <T>
     *//*
    sealed class Result<out R> {

        data class Success<out T>(val data: T) : Result<T>()
        data class Error(val exception: Exception) : Result<Nothing>()

        override fun toString(): String {
            return when (this) {
                is Success<*> -> "Success[data=$data]"
                is Error -> "Error[exception=$exception]"
            }
        }
    }*/
}