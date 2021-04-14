package com.example.testsample;

import android.content.Context;

public class ResourceComparator {


    /*
     *  returns true if given string is equal to string present given resourceId
     *  returns false if given string is not equal to string present given resourceId
     */
    public boolean isEqual(
            Context mContext,
            int resId,
            String str){
        return mContext.getString(resId).equals(str);
    }
}
