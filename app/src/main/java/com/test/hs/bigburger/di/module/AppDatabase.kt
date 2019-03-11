package com.test.hs.bigburger.di.module

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.test.hs.data.products.database.model.Product
import com.test.hs.data.products.database.repository.ProductDao

/**
 * Created by hamza on 08/03/2019.
 */
@Database(entities = [(Product::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

}