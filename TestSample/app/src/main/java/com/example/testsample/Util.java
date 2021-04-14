package com.example.testsample;

public class Util {

    /*
     *  returns nth element of Fibonacci Series
     *  ... if n==0 returns 0
     *  ... if n==1 returns 1
     *  ... if n==2 returns 2
     */
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 1;

        if(n==0){
            return a;
        }

        if(n==1){
            return b;
        }

        if(n>1){
            int i = 2;
            while(i<n){
                c = a+b;
                a = b;
                b = c;
                i++;
            }
            return c;
        }
        return 0;
    }
}
