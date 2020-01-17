package com.omtians9425.dagger_fragmentfactory_navigation

import android.app.Application
import com.omtians9425.dagger_fragmentfactory_navigation.di.AppComponent
import com.omtians9425.dagger_fragmentfactory_navigation.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}
