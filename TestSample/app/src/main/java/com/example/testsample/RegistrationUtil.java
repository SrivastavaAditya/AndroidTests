package com.example.testsample;

import java.util.ArrayList;

public class RegistrationUtil {


    ArrayList<String> userNameList = new ArrayList<String>(){
        {
            add("Peter");
            add("Carl");
        }
    };
    /*
     *  the input is not valid if...
     *  ... userName/password/confirmPassword are empty
     *  ... userName already takenn
     *  ... confirmPassword != password
     *  ... password length < 2
     */
    public static boolean validateUSer(
            String userName,
            String password,
            String confirmPassword
    ){
        return true;
    }
}
