package com.test.hs.bigburger.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.hs.bigburger.presenters.BasePresenter
import javax.inject.Inject

/**
 * Created by hamza on 23/02/2019.
 */
abstract class BaseActivity<P : BasePresenter<Any>> : AppCompatActivity() {

    @Inject
    lateinit var presenter: P

    protected abstract fun getLayout(): Int
    protected abstract fun initInjector()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        initInjector()
        initPresenter()
    }

    private fun initPresenter() {
        presenter.attachView(this)
        presenter.initialise()
    }

    override fun onDestroy() {
        presenter.disposeSubscriptions()
        presenter.detachView()
        super.onDestroy()
    }
}