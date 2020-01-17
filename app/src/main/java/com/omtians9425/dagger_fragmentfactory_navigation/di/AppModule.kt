package com.omtians9425.dagger_fragmentfactory_navigation.di

import com.omtians9425.dagger_fragmentfactory_navigation.SampleRepository
import com.omtians9425.dagger_fragmentfactory_navigation.ui.InjectingNavHostFragment
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideInjectingNavHostFragment(): InjectingNavHostFragment {
        return InjectingNavHostFragment()
    }

    @Provides
    fun provideSampleRepository(): SampleRepository {
        return SampleRepository()
    }
}