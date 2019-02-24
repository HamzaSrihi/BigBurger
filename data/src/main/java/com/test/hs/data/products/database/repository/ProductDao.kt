package com.test.hs.data.products.database.repository

import android.arch.persistence.room.*
import com.test.hs.data.products.database.model.Product

/**
 * Created by hamza on 24/02/2019.
 */

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(product: Product)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(product: Product)

    @Query("SELECT * FROM products WHERE  id = :arg0")
    fun find(id: String) : Product

    @Query("SELECT * FROM products")
    fun loadAll(): List<Product>
}