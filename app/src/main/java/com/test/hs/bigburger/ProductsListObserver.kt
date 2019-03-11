package com.test.hs.bigburger

import com.test.hs.bigburger.presenters.ProductPresenter
import com.test.hs.domain.Product
import io.reactivex.observers.DisposableSingleObserver

/**
 * Created by hamza on 08/03/2019.
 */
class ProductsListObserver(private val presenter: ProductPresenter) : DisposableSingleObserver<List<Product>>() {
    override fun onSuccess(productsList: List<Product>) {
        presenter.showProductsList(productsList)
    }

    override fun onError(e: Throwable) {
        e.printStackTrace()
    }
}