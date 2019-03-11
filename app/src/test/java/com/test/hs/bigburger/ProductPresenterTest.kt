package com.test.hs.bigburger

import com.test.hs.bigburger.presenters.ProductPresenter
import com.test.hs.domain.GetProductListUseCase
import com.test.hs.domain.Product
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

/**
 * Created by hamza on 08/03/2019.
 */

@RunWith(PowerMockRunner::class)
@PrepareForTest(GetProductListUseCase::class)
class ProductPresenterTest {

    private lateinit var presenter: ProductPresenter

    @Suppress("UNCHECKED_CAST")
    private fun <T> any(type: Class<T>): T {
        Mockito.any<T>(type)
        return null as T
    }

    @Mock
    lateinit var getProductListUseCase: GetProductListUseCase

    @Mock
    lateinit var view: ProductView

    @Before
    fun setUp() {
        presenter = ProductPresenter(getProductListUseCase)
        presenter.attachView(view)
    }

    @Test
    fun `should init view`() {
        presenter.initialise()
        verify(view).initialiseView()
    }

    @Test
    fun `should dispose subscription`() {
        presenter.disposeSubscriptions()
        verify(getProductListUseCase).dispose()
    }

    @Test
    fun `should execute usecase when initialise is invoked`() {
        presenter.initialise()
        verify(getProductListUseCase).execute(any(ProductsListObserver::class.java), ArgumentMatchers.isNull())
    }

    @Test
    fun `should set articles list to view`() {
        val list = emptyList<Product>()
        presenter.showProductsList(list)
        verify(view).showProductsList(list)
    }
}
