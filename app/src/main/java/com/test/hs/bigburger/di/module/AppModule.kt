package com.test.hs.bigburger.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.test.hs.data.products.database.repository.ProductRepo
import com.test.hs.data.products.database.repository.ProductRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hamza on 23/02/2019.
 */
@Module
class AppModule {
    @Provides
    @Singleton
    internal fun provideAppContext(app: Application): Context = app

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "big_burger.db").build()

    @Provides
    @Singleton
    internal fun provideProductRepoHelper(appDatabase: AppDatabase): ProductRepo = ProductRepository(appDatabase.productDao())
}