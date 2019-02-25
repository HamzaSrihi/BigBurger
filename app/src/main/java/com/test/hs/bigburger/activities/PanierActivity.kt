package com.test.hs.bigburger.activities

import com.test.hs.bigburger.App
import com.test.hs.bigburger.R
import com.test.hs.bigburger.di.component.DaggerPanierComponent
import com.test.hs.bigburger.presenters.PanierPresenter
import com.test.hs.domain.Product
import kotlinx.android.synthetic.main.activity_panier.*

class PanierActivity : BaseActivity<PanierPresenter>(), PanierView {


    override fun initialiseView() {
        list_panier.apply {
            setHasFixedSize(true)
        }
    }

    override fun showProductsList(products: List<Product>) {

    }

    override fun getLayout(): Int = R.layout.activity_panier

    override fun initInjector() {
        DaggerPanierComponent.builder()
                .appComponent((application as App).applicationComponent)
                .build()
                .inject(this)
    }

}
