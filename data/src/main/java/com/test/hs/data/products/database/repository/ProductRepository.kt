package com.test.hs.data.products.database.repository

import com.test.hs.data.products.database.model.Product
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by hamza on 08/03/2019.
 */

class ProductRepository @Inject constructor(private val productDao: ProductDao) : ProductRepo {
    override fun updateProduct(product: Product): Observable<Boolean> {
        productDao.update(product)
        return Observable.just(true)
    }

    override fun findProduct(id: String): Observable<Product> = Observable.fromCallable({ productDao.find(id) })

    override fun isProductRepoEmpty(): Observable<Boolean> = Observable.fromCallable({ productDao.loadAll().isEmpty() })

    override fun insertProduct(product: Product): Observable<Boolean> {
        productDao.insert(product)
        return Observable.just(true)
    }

    override fun loadProducts(): Observable<List<Product>> = Observable.fromCallable({ productDao.loadAll() })

}