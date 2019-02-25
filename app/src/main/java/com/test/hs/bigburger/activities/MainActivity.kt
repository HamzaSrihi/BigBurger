package com.test.hs.bigburger.activities

import android.content.ClipData.newIntent
import android.content.Intent
import com.test.hs.bigburger.App
import com.test.hs.bigburger.R
import com.test.hs.bigburger.adapters.ProductListAdapter
import com.test.hs.bigburger.di.component.DaggerProductComponent

import com.test.hs.bigburger.presenters.ProductPresenter
import com.test.hs.domain.Product
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list_panier.*

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
        buttonPanier.setOnClickListener { goToPanier() }
    }

    override fun showProductsList(products: List<Product>) {
        list_product.adapter = ProductListAdapter(this,
                { product: Product -> itemclicked(product) }, products)
    }

    private fun itemclicked(product: Product) {

    }

    override fun goToPanier() {
        val intent = Intent(this, PanierActivity::class.java)
        startActivity(intent)
    }
}
