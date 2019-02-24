package com.test.hs.data.products.database.repository

import com.test.hs.data.products.database.model.Product
import dagger.Provides
import io.reactivex.Observable

/**
 * Created by hamza on 24/02/2019.
 */

interface ProductRepo {

    @Provides
    fun isProductRepoEmpty(): Observable<Boolean>

    @Provides
    fun insertProduct(product: Product): Observable<Boolean>

    @Provides
    fun updateProduct(product: Product): Observable<Boolean>

    @Provides
    fun findProduct(id: String): Observable<Product>

    fun loadProducts(): Observable<List<Product>>
}