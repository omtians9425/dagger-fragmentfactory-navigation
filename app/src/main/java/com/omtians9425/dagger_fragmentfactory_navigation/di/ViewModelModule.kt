package com.omtians9425.dagger_fragmentfactory_navigation.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.omtians9425.dagger_fragmentfactory_navigation.ui.FirstViewModel
import com.omtians9425.dagger_fragmentfactory_navigation.ui.SecondViewModel
import com.omtians9425.dagger_fragmentfactory_navigation.ui.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel::class)
    fun provideFirstViewModel(viewModel: FirstViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SecondViewModel::class)
    fun provideSecondViewModel(viewModel: SecondViewModel): ViewModel
}