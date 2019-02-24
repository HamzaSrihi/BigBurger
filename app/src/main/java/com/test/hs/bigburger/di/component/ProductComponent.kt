package com.test.hs.bigburger.di.component

import com.test.hs.bigburger.activities.MainActivity
import com.test.hs.bigburger.activities.PerActivity
import com.test.hs.bigburger.di.module.ProductModule
import dagger.Component

/**
 * Created by hamza on 24/02/2019.
 */

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [ProductModule::class])
interface ProductComponent {
    fun inject(mainActivity: MainActivity)
}