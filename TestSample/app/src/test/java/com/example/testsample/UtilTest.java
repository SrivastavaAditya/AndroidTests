package com.example.testsample;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void fibonacci0thElementReturnsTrue(){
        int result = Util.fibonacci(0);

        assertEquals(0, result);
    }


    @Test
    public void fibonacci1stElementReturnsTrue(){
        int result = Util.fibonacci(1);

        assertEquals(1, result);
    }


    @Test
    public void fibonacci2ndElementReturnsTrue(){
        int result = Util.fibonacci(2);

        assertEquals(1, result);
    }


    @Test
    public void fibonacciNthElementReturnsTrue(){
        int n = 5;
        int result = Util.fibonacci(n);

        assertEquals(3, result);
    }

}