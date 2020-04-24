package com.example.testsample;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class FragmentToTestTest {

    @Rule
    public ActivityTestRule<TestActivity> mActivityTestRule = new ActivityTestRule<TestActivity>(TestActivity.class);

    private TestActivity mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        ConstraintLayout clContainer = (ConstraintLayout)mActivity.findViewById(R.id.test_container);

        assertNotNull(clContainer);

        FragmentToTest fragment = new FragmentToTest();

        mActivity.getSupportFragmentManager().beginTransaction().add(clContainer.getId(), fragment).commitAllowingStateLoss();

        getInstrumentation().waitForIdleSync();

        View v = fragment.getView().findViewById(R.id.view_in_fragment);

        assertNotNull(v);
    }

    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}