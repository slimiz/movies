package com.yassir.movies.data.di




import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.yassir.movies.BuildConfig

import com.yassir.movies.data.remote.api.MovieApiService



import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder()
            .create()
    }


    @Provides
    fun provideBaseUrl() = BuildConfig.BASE_URL


    @Provides
    @Singleton
    fun providesOkhttp():OkHttpClient{
        val okhhtp = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logger = HttpLoggingInterceptor()
            logger.setLevel(HttpLoggingInterceptor.Level.BODY)

            okhhtp.addInterceptor(logger)
        }
        return okhhtp
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(gson: Gson,okHttpClient: OkHttpClient):Retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addConverterFactory(ScalarsConverterFactory.create())
        .client(okHttpClient)
        .baseUrl(BuildConfig.BASE_URL)
        .build()


    @Provides
    @Singleton
    fun providesMovieApiService(retrofit: Retrofit): MovieApiService = retrofit.create(
        MovieApiService::class.java)
}