package com.omtians9425.dagger_fragmentfactory_navigation.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.omtians9425.dagger_fragmentfactory_navigation.ui.FirstFragment
import com.omtians9425.dagger_fragmentfactory_navigation.ui.MyFragmentFactory
import com.omtians9425.dagger_fragmentfactory_navigation.ui.SecondFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface FragmentModule {

    @Binds
    fun provideFragmentFactory(factory: MyFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(FirstFragment::class)
    fun provideFirstFragment(fragment: FirstFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(SecondFragment::class)
    fun provideSecondFragment(fragment: SecondFragment): Fragment
}