package com.test.hs.data.products.model

import com.google.gson.annotations.Expose
import com.test.hs.data.model.Product

/**
 * Created by hamza on 08/03/2019.
 */
data class Products
(@Expose
 var products: ArrayList<Product>? = null)
