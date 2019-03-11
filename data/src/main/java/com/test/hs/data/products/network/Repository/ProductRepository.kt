package com.test.hs.data.Repository

import com.test.hs.data.model.Product
import com.test.hs.data.products.network.Endpoint
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by hamza on 08/03/2019.
 */
class ProductRepository @Inject constructor(private val endpoint: Endpoint) {
    fun products(): Single<ArrayList<Product>> = endpoint.getProductsList()

}