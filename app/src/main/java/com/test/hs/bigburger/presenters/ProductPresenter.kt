package com.test.hs.bigburger.presenters

import com.test.hs.bigburger.ProductView
import com.test.hs.bigburger.ProductsListObserver
import com.test.hs.data.products.database.repository.ProductRepo
import com.test.hs.domain.GetProductListUseCase
import com.test.hs.domain.Product
import javax.inject.Inject

/**
 * Created by hamza on 23/02/2019.
 */
class ProductPresenter @Inject constructor(private val getProductListUseCase: GetProductListUseCase) : BasePresenter<ProductView>() {

    val productRepoHelper: ProductRepo? = null
    override fun initialise() {
        getView()?.initialiseView()
        getProductListUseCase.execute(ProductsListObserver(this))
    }

    override fun disposeSubscriptions() {
        getProductListUseCase.dispose()
    }

    fun showProductsList(productsList: List<Product>) {
        getView()?.showProductsList(productsList)
    }

    fun insertProduct(product: Product) {


        if (productRepoHelper!!.findProduct(product.id!!) != null) {
           val productDb :com.test.hs.data.products.database.model.Product = productRepoHelper!!.findProduct(product.id!!).blockingFirst()
            productDb.quantity = +1
            productRepoHelper.updateProduct(productDb)
        } else {
          val  productDb = com.test.hs.data.products.database.model.Product(product.id!!, product.title!!, product.description!!, product.thumbnail!!, product.price!!, 1)
            productRepoHelper!!.insertProduct(productDb)
        }



    }
}