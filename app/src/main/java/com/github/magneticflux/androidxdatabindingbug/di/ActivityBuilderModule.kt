package com.github.magneticflux.androidxdatabindingbug.di

import com.github.magneticflux.androidxdatabindingbug.MainActivity
import com.github.magneticflux.androidxdatabindingbug.di.scopes.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    @PerActivity
    internal abstract fun contributesMainActivity(): MainActivity
}
