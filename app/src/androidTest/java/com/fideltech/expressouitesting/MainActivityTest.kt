package com.fideltech.expressouitesting

import android.view.View
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
public class MainActivityTest {

    //checking activity is visible or not
    @Test
    fun test_isActivityInView() {
        /*val activityScenario = */
        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }
/*

    //test visibility of view
    @Test
    fun test_visibility_title_nextButton() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))

        ///method 1 to test visibility
        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))

        //method 2 to test visibility of view
        onView(withId(R.id.button_next_activity))
            .check(
                matches(
                    withEffectiveVisibility(
                        Visibility.VISIBLE
                    )
                )
            )
    }
*/

    //test textview text with set string
    @Test
    fun test_isTitleDisplayed() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title))
            .check(matches(
                 withText(
                     R.string.text_mainactivity
                 )
            ))
    }


  /*  //checking navigation to secondary activity
    @Test
    fun test_navSecondaryActivity() {
         ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity))
            .perform(click())

        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
    }

    //nav to 2nd act and press back and go to main act and check for is display
    @Test
    fun text_backpress_ToMainAcitivyt() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity))
            .perform(click())

        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))


        //for go back method 1
//        onView(withId(R.id.button_back_activity))
//            .perform(click())

        //method 2
        pressBack()
        onView(withId(R.id.main)).check(matches(isDisplayed()))

    }*/
}