package com.test.hs.bigburger.di.module

import com.test.hs.data.Repository.ProductRepository
import com.test.hs.domain.GetProductListUseCase

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by hamza on 23/02/2019.
 */
@Module
class UseCaseModule {
    @Provides
    @Singleton
    @Named("ioScheduler")
    internal fun provideIoScheduler() = Schedulers.io()

    @Provides
    @Singleton
    @Named("mainThreadScheduler")
    internal fun provideMainThreadScheduler() = AndroidSchedulers.mainThread()

    @Provides
    @Singleton
    internal fun provideGetArticlesListUseCase(productsRepository: ProductRepository, @Named("ioScheduler") ioScheduler: Scheduler, @Named("mainThreadScheduler") mainThreadScheduler: Scheduler): GetProductListUseCase =
            GetProductListUseCase(productsRepository, ioScheduler, mainThreadScheduler)
}