package com.learnbydisect.uitesting

import android.service.autofill.FieldClassification
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
/**
 * Created by Youbaraj Poudel at Talan
 * Created on 8/2/2021
 *
 */
 class MainActivityTest {
    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))
    }
    @Test
    fun test_visibility_title_next_button() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title))//method 1
            .check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))//method 2
         }

    @Test
    fun is_Title_Text_Displayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title))
            .check(matches(withText(R.string.text_mainactivity)))
    }


}