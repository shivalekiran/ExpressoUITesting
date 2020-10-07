package com.fideltech.expressouitesting.frag_movie.ui.movie

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.fideltech.expressouitesting.R
import com.fideltech.expressouitesting.data.DummyMovies
import com.fideltech.expressouitesting.factory.MovieFragmentFactory
import com.fideltech.expressouitesting.ui.movie.DirectorsFragment
import kotlinx.android.synthetic.main.fragment_directors.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DirectorsFragmentTest{
    @Test
    fun test_isDirecrtorListVisible() {
        //setup
        val directors = DummyMovies.THE_RUNDOWN.directors
        val factory = MovieFragmentFactory()
        val bundle = Bundle()
        bundle.putStringArrayList("args_directors", directors)
        val scenario = launchFragmentInContainer<DirectorsFragment>(
            fragmentArgs = bundle,
            factory = factory
        )
        //verify what's in view
        onView(
            withId(R.id.directors_text)
        ).check(matches(
            withText(
                 DirectorsFragment.stringBuilderForDirectors(directors!!)
            )
        ))
    }
}