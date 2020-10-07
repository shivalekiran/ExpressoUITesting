package com.fideltech.expressouitesting.frag_movie.ui.movie

import android.os.Bundle
import androidx.fragment.app.testing.launchFragment
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.fideltech.expressouitesting.R
import com.fideltech.expressouitesting.data.DummyMovies.THE_RUNDOWN
import com.fideltech.expressouitesting.factory.MovieFragmentFactory
import com.fideltech.expressouitesting.ui.movie.MovieDetailFragment
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MovieDetailFragmentTest {
    @Test
    fun test_isMovieDataVisible() {
        //setup
        val movie = THE_RUNDOWN
        val factory = MovieFragmentFactory()
        val bundle = Bundle()
        bundle.putInt("movie_id", movie.id)

        //opening fragment
        val scenario = launchFragmentInContainer<MovieDetailFragment>(
            fragmentArgs = bundle,
            factory = factory
        )
        onView(withId(R.id.movie_title))
            .check(
                matches(
                    withText(
                        movie.title
                    )
                )
            )

        onView(withId(R.id.movie_description))
            .check(matches(withText(
                movie.description
            )))
    }
}