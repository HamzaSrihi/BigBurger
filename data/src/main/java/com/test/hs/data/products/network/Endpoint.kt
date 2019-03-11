package com.test.hs.data.products.network


import com.test.hs.data.model.Product
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by hamza on 08/03/2019.
 */
interface Endpoint {
    @GET("https://bigburger.useradgents.com/catalog")
    fun getProductsList(): Single<ArrayList<Product>>
}