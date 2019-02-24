package com.test.hs.bigburger.presenters

/**
 * Created by hamza on 23/02/2019.
 */
abstract class BasePresenter<out T> {
    private var view: T? = null

    abstract fun initialise()
    abstract fun disposeSubscriptions()

    fun getView(): T? = view

    @Suppress("UNCHECKED_CAST")
    fun attachView(view: Any?) {
        this.view = view as T?
    }

    fun detachView() {
        view = null
    }
}