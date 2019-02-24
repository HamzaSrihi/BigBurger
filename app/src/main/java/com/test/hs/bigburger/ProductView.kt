package com.test.hs.bigburger

import com.test.hs.domain.Product

/**
 * Created by hamza on 23/02/2019.
 */
interface ProductView {
    fun initialiseView()
    fun showProductsList(products: List<Product>)
}
