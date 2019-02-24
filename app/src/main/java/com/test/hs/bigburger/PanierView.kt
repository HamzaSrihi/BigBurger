package com.test.hs.bigburger

import com.test.hs.domain.Product

/**
 * Created by hamza on 25/02/2019.
 */
interface PanierView {
    fun initialiseView()
    fun showProductsList(products: List<Product>)
}