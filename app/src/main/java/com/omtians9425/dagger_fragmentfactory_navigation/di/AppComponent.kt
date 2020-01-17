package com.omtians9425.dagger_fragmentfactory_navigation.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(app: Application): Builder
    }
}