package com.omtians9425.dagger_fragmentfactory_navigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.omtians9425.dagger_fragmentfactory_navigation.R
import javax.inject.Inject


class FirstFragment @Inject constructor(
    factory: ViewModelProvider.Factory
) : Fragment() {

    private val viewModel by viewModels<FirstViewModel> { factory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }
}
