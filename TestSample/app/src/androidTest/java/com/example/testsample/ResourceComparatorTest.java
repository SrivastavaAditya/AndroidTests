package com.example.testsample;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResourceComparatorTest {

    private ResourceComparator resourceComparator;


    @Before
    public void setUp(){
        resourceComparator = new ResourceComparator();
    }


    @After
    public void tearDown(){
        //  To destroy resources
    }


    @Test
    public void stringResourceSameAsGivenStringReturnsTrue(){
        Context mContext = ApplicationProvider.getApplicationContext();

        boolean result = resourceComparator.isEqual(
                mContext,
                R.string.app_name,
                "TestSample"
        );

        assertTrue("Same",result);
    }


    @Test
    public void stringResourceDiffFromGivenString_ReturnsFalse(){
        Context mContext = ApplicationProvider.getApplicationContext();

        boolean result = resourceComparator.isEqual(
                mContext,
                R.string.app_name,
                "Test"
        );

        assertFalse("Different",result);
    }


}