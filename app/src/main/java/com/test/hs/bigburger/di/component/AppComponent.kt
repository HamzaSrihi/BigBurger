package com.test.hs.bigburger.di.component


import android.app.Application
import android.content.Context
import com.test.hs.bigburger.App
import com.test.hs.bigburger.di.module.*
import com.test.hs.data.products.network.Endpoint
import com.test.hs.domain.GetProductListUseCase
import dagger.BindsInstance

import dagger.Component
import javax.inject.Singleton

/**
 * Created by hamza on 23/02/2019.
 */
@Singleton
@Component(modules = [AppModule::class, IOModule::class, RepositoryModule::class, UseCaseModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
    fun inject(app: App)
    fun getApplicationContext(): Context
    fun getEndpoint(): Endpoint

    fun getProductsListUseCase(): GetProductListUseCase
}