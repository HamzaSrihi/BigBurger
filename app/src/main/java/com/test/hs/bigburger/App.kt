package com.test.hs.bigburger

import android.app.Application
import com.test.hs.bigburger.di.component.AppComponent
import com.test.hs.bigburger.di.component.DaggerAppComponent

/**
 * Created by hamza on 08/03/2019.
 */
class App : Application() {
    val applicationComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .application(this)
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        /* DaggerAppComponent.builder()
                 .application(this)
                 .build()
                 .inject(this)*/
        initInjector()
    }

    private fun initInjector() {
        applicationComponent.inject(this)
    }
}