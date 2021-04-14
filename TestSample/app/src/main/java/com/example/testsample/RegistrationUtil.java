package com.example.testsample;

import java.util.ArrayList;

public class RegistrationUtil {


    static ArrayList<String> userNameList = new ArrayList<String>(){
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
        if(userName.isEmpty()){
            return false;
        }

        if(password.isEmpty()){
            return false;
        }

        if(confirmPassword.isEmpty()){
            return false;
        }

        for(String user: userNameList){
            if(user.equalsIgnoreCase(userName)){
                return false;
            }
        }

        if(password.length()<2){
            return false;
        }

        if(confirmPassword.length()<2){
            return false;
        }

        if(!password.equalsIgnoreCase(confirmPassword)){
            return false;
        }

        return true;
    }
}
