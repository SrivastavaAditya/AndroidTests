package com.example.testsample;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4ClassRunner.class)
public class SeconndActivityTest {

    /*
     *  Note: Single instance of ActivityScenarioRule is created at global level
     *  Reason: tests can execute with single instance of ActivityScenarioRule
     */

    @Rule
    public ActivityScenarioRule<SeconndActivity> activityScenario = new ActivityScenarioRule<>(SeconndActivity.class);


    @Test
    public void test_isActivityInView(){
        onView(withId(R.id.cl_second)).check(matches(isDisplayed()));
    }


    @Test
    public void test_isTitleDisplayed(){
        onView(withId(R.id.tv_second_activity_name)).check(matches(isDisplayed()));
    }


    @Test
    public void test_isButtonBackDisplayed(){
        onView(withId(R.id.btn_back)).check(matches(isDisplayed()));
    }


    @Test
    public void test_isTitleTextDisplayed(){
        onView(withId(R.id.tv_second_activity_name))
                .check(matches(withText(SeconndActivity.class.getSimpleName())));
    }


    @Test
    public void test_isButtonBackTextDisplayed(){
        onView(withId(R.id.btn_back)).check(matches(withText(R.string.back)));
    }
}
