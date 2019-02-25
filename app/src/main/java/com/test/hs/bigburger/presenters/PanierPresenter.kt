package com.test.hs.bigburger.presenters

import com.test.hs.bigburger.activities.PanierView

import javax.inject.Inject

/**
 * Created by hamza on 25/02/2019.
 */
class PanierPresenter @Inject constructor() : BasePresenter<PanierView>() {
    override fun initialise() {
        getView()?.initialiseView()
    }

    override fun disposeSubscriptions() {

    }
}