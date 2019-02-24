package com.test.hs.bigburger.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.hs.bigburger.PanierView
import com.test.hs.bigburger.R
import com.test.hs.bigburger.presenters.PanierPresenter
import com.test.hs.domain.Product

class PanierActivity : BaseActivity<PanierPresenter>(), PanierView {
    override fun initialiseView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProductsList(products: List<Product>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayout(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initInjector() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panier)
    }
}
