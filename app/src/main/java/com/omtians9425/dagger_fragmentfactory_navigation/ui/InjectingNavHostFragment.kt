package com.omtians9425.dagger_fragmentfactory_navigation.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.navigation.fragment.NavHostFragment
import com.omtians9425.dagger_fragmentfactory_navigation.App
import javax.inject.Inject

class InjectingNavHostFragment : NavHostFragment() {

    @Inject
    lateinit var daggerFragmentInjectionFactory: FragmentFactory

    override fun onAttach(context: Context) {
        daggerFragmentInjectionFactory =
            (requireActivity().application as App)
                .appComponent
                .fragmentFactory()
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        childFragmentManager.fragmentFactory = daggerFragmentInjectionFactory
        super.onCreate(savedInstanceState)
    }
}