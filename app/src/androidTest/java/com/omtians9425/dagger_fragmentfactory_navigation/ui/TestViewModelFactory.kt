package com.omtians9425.dagger_fragmentfactory_navigation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * test version for [ViewModelFactory].
 */
class TestViewModelFactory<T : ViewModel>(
    private val specifiedModel: T
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(specifiedModel.javaClass)) {
            return specifiedModel as T
        }
        throw IllegalArgumentException("unexpected model class $modelClass")
    }
}