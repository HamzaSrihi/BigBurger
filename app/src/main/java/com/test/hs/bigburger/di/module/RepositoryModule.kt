package com.test.hs.bigburger.di.module

import com.test.hs.data.Repository.ProductRepository
import com.test.hs.data.products.network.Endpoint
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hamza on 08/03/2019.
 */
@Module
class RepositoryModule {
    @Provides
    @Singleton
    internal fun provideArticleRepository(endpoint: Endpoint): ProductRepository = ProductRepository(endpoint)
}