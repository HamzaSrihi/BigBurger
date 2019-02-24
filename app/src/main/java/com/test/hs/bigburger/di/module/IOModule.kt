package com.test.hs.bigburger.di.module

import com.google.gson.GsonBuilder
import com.test.hs.bigburger.BuildConfig
import com.test.hs.data.products.network.Endpoint
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by hamza on 23/02/2019.
 */
@Module
class IOModule {
    private val endpoint: Endpoint

    init {
        val okHttpBuilder = OkHttpClient.Builder()

        val okHttpClient = okHttpBuilder.build()

        val gson = GsonBuilder().create()

        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(BuildConfig.ENDPOINT)
                .client(okHttpClient)
                .build()

        endpoint = retrofit.create(Endpoint::class.java)
    }

    @Provides
    @Singleton
    internal fun provideEndpoint(): Endpoint = endpoint
}