package com.omtians9425.dagger_fragmentfactory_navigation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.RuntimeException
import javax.inject.Inject
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
open class ViewModelFactory @Inject constructor(
    private val providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val found = providers.entries.find { modelClass.isAssignableFrom(it.key) }
        val provider =
            found?.value ?: throw IllegalArgumentException("Unknown model class ${modelClass.name}")

        try {
            return provider.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}