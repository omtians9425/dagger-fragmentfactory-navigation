package com.omtians9425.dagger_fragmentfactory_navigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.filters.MediumTest
import com.omtians9425.dagger_fragmentfactory_navigation.R
import com.omtians9425.dagger_fragmentfactory_navigation.SampleRepository
import org.junit.Test
import org.mockito.Mockito.mock

@MediumTest
class FirstFragmentTest {

    lateinit var viewModelFactory: ViewModelProvider.Factory

    private fun launchFragment(
        navController: NavController?,
        viewModelFactory: ViewModelProvider.Factory
    ) {
        val scenario = launchFragmentInContainer<FirstFragment>(
            Bundle(),
            R.style.AppTheme,
            object : FragmentFactory() {
                override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
                    return FirstFragment(viewModelFactory)
                }
            })
        scenario.onFragment {
            Navigation.setViewNavController(it.view!!, navController)
        }
    }

    @Test
    fun test() {
        // Create a ViewModel with the fake Repository injected and pass it to Test-ViewModelFactory.
        val fakeRepo = SampleRepository()
        viewModelFactory = TestViewModelFactory(FirstViewModel(fakeRepo))

        val navController = mock(NavController::class.java)
        launchFragment(navController, viewModelFactory)

        // THEN test!!
    }
}