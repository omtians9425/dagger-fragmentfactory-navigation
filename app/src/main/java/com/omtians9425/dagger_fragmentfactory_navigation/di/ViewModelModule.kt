package com.omtians9425.dagger_fragmentfactory_navigation.di

import androidx.lifecycle.ViewModel
import com.omtians9425.dagger_fragmentfactory_navigation.FirstViewModel
import com.omtians9425.dagger_fragmentfactory_navigation.SecondViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel::class)
    fun provideFirstViewModel(viewModel: FirstViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SecondViewModel::class)
    fun provideSecondViewModel(viewModel: SecondViewModel): ViewModel
}