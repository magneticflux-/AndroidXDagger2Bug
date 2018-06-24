package com.github.magneticflux.androidxdatabindingbug.di

import com.github.magneticflux.androidxdatabindingbug.MyFragment
import com.github.magneticflux.androidxdatabindingbug.di.scopes.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Mitchell Skaggs on 6/24/2018.
 */

@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    @PerFragment
    internal abstract fun contributesMyFragment(): MyFragment
}
