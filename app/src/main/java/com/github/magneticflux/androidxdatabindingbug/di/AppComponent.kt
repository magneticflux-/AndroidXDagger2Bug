package com.github.magneticflux.androidxdatabindingbug.di

import com.github.magneticflux.androidxdatabindingbug.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [
    AppModule::class,

    ActivityBuilderModule::class,
    AndroidInjectionModule::class
])
interface AppComponent : AndroidInjector<MyApplication> {
    override fun inject(instance: MyApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MyApplication): Builder

        fun build(): AppComponent
    }
}
