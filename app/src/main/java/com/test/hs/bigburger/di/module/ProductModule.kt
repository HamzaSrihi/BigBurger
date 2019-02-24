package com.test.hs.bigburger.di.module

import com.test.hs.bigburger.activities.PerActivity
import com.test.hs.bigburger.presenters.ProductPresenter
import com.test.hs.data.products.database.repository.ProductRepo

import com.test.hs.domain.GetProductListUseCase
import dagger.Module
import dagger.Provides

/**
 * Created by hamza on 24/02/2019.
 */


@Module
class ProductModule {
    @PerActivity
    @Provides
    fun provideProductPresenter(getProductListUseCase: GetProductListUseCase) = ProductPresenter(getProductListUseCase)
}