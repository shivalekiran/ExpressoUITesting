package com.fideltech.expressouitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest {
    @get: Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)


    @Test
    fun test_isActivityInView() {
        onView(ViewMatchers.withId(R.id.secondary))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }


    //test visibility of view
    @Test
    fun test_visibility_title_nextButton() {
        onView(ViewMatchers.withId(R.id.activity_secondary_title)).check(
            ViewAssertions.matches(
                ViewMatchers.isDisplayed()
            )
        )

        ///method 1 to test visibility
        onView(ViewMatchers.withId(R.id.button_back_activity))
            .check(
                ViewAssertions.matches(
                    ViewMatchers.isDisplayed()
                )
            )

    }

    //test textview text with set string
    @Test
    fun test_isTitleDisplayed() {
        onView(ViewMatchers.withId(R.id.activity_secondary_title    ))
            .check(
                ViewAssertions.matches(
                    ViewMatchers.withText(
                        R.string.text_secondaryactivity
                    )
                )
            )
    }
}