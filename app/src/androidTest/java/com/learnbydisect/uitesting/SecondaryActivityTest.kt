package com.learnbydisect.uitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

/**
 * Created by Youbaraj Poudel at Talan
 * Created on 8/2/2021
 *
 */
class SecondaryActivityTest{
    @get: Rule
    val activityRule= ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView() {

        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
     }

    @Test
    fun test_visibility_title_backBUtton() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.button_back))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(withText(R.string.text_secondaryactivity)))
    }
}