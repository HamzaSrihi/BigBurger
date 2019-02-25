package com.test.hs.bigburger.di.component

import com.test.hs.bigburger.activities.PanierActivity
import com.test.hs.bigburger.activities.PerActivity
import com.test.hs.bigburger.di.module.PanierModule
import dagger.Component

/**
 * Created by hamza on 25/02/2019.
 */

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [PanierModule::class])
interface PanierComponent {
    fun inject(panierActivity: PanierActivity)
}