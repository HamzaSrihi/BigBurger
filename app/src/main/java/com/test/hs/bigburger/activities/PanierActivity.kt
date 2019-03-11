package com.test.hs.bigburger.activities

import com.test.hs.bigburger.PanierView
import com.test.hs.bigburger.R
import com.test.hs.bigburger.presenters.PanierPresenter
import com.test.hs.domain.Product

/**
 * Created by hamza on 08/03/2019.
 */
class PanierActivity : BaseActivity<PanierPresenter>(), PanierView {


    override fun getLayout(): Int = R.layout.activity_panier

    override fun initInjector() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initialiseView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProductsList(products: List<Product>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
