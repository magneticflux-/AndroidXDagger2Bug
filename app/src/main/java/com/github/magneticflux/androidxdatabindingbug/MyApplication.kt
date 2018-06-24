package com.github.magneticflux.androidxdatabindingbug

import com.github.magneticflux.androidxdatabindingbug.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by Mitchell Skaggs on 6/23/2018.
 */
class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
            DaggerAppComponent.builder().application(this).build()
}