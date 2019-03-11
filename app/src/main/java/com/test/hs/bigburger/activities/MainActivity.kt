package com.test.hs.bigburger.activities

import com.test.hs.bigburger.App
import com.test.hs.bigburger.ProductView
import com.test.hs.bigburger.R
import com.test.hs.bigburger.adapters.ProductListAdapter
import com.test.hs.bigburger.di.component.DaggerProductComponent

import com.test.hs.bigburger.presenters.ProductPresenter
import com.test.hs.domain.Product
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by hamza on 08/03/2019.
 */
class MainActivity : BaseActivity<ProductPresenter>(), ProductView {
    override fun getLayout(): Int = R.layout.activity_main

    override fun initInjector() {
        DaggerProductComponent.builder()
                .appComponent((application as App).applicationComponent)
                .build()
                .inject(this)
    }

    override fun initialiseView() {
        list_product.apply {
            setHasFixedSize(true)
        }
    }

    override fun showProductsList(products: List<Product>) {
        list_product.adapter = ProductListAdapter(this,
                { product: Product -> itemclicked(product) }, products)
    }

    private fun itemclicked(product: Product) {
        //presenter.insertProduct(product)
    }
}
