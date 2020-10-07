package com.fideltech.expressouitesting.frag_movie.ui.movie

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.fideltech.expressouitesting.R
import com.fideltech.expressouitesting.data.DummyMovies
import com.fideltech.expressouitesting.factory.MovieFragmentFactory
import com.fideltech.expressouitesting.ui.movie.DirectorsFragment
import com.fideltech.expressouitesting.ui.movie.StarActorsFragment
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class StarActorsFragmentTest{

    @Test
    fun test_isDirecrtorListVisible() {
        //setup
        val star_actors = DummyMovies.THE_RUNDOWN.star_actors
        val factory = MovieFragmentFactory()
        val bundle = Bundle()
        bundle.putStringArrayList("args_actors", star_actors)
        val scenario = launchFragmentInContainer<StarActorsFragment>(
            fragmentArgs = bundle,
            factory = factory
        )
        //verify what's in view
        Espresso.onView(
            ViewMatchers.withId(R.id.star_actors_text)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText(
                    StarActorsFragment.stringBuilderForStarActors(star_actors!!)
                )
            )
        )
    }
}