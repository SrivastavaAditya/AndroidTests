package com.example.testsample;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    /*
     *  Note: ActivityScenario object is created inside every test
     *  Reason: Tests should be isolated and independent of each other
     */

    @Test
    public void test_isActivityInView(){
        ActivityScenario<MainActivity> mainActivityActivityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.cl_main)).check(matches(isDisplayed()));
    }


    @Test
    public void test_isTitleVisible(){
        ActivityScenario<MainActivity> mainActivityActivityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.tv_main_activity_name)).check(matches(isDisplayed()));  // method 1

        onView(withId(R.id.tv_main_activity_name))
                .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));  // method 2
    }


    @Test
    public void test_isButtonNextVisible(){
        ActivityScenario<MainActivity> mainActivityActivityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.btn_next)).check(matches(isDisplayed()));
    }


    @Test
    public void test_isTitleTextDisplayed(){
        ActivityScenario<MainActivity> mainActivityActivityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.tv_main_activity_name))
                .check(matches(withText(MainActivity.class.getSimpleName())));
    }


    @Test
    public void test_isButtonTextDisplayed() {
        ActivityScenario<MainActivity> mainActivityActivityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.btn_next)).check(matches(withText(R.string.next)));
    }
}