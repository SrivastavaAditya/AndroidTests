package com.example.testsample;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrationUtilTest {


    @Test
    public void emptyUserNameReturnsFalse(){
        boolean result = RegistrationUtil.validateUSer(
                "",
                "1234",
                "1234"
        );

        assertFalse("Empty Username invalid", result);
    }


    @Test
    public void validUserAndPasswordsCorrectReturnsTrue(){
        boolean result = RegistrationUtil.validateUSer(
                "Aditya",
                "1234",
                "1234"
        );

        assertTrue("Valid Username Aditya",result);
    }


    @Test
    public void userNameAlreadyExistsReturnsFalse(){
        boolean result = RegistrationUtil.validateUSer(
                "Carl",
                "1234",
                "1234"
        );

        assertFalse("Username Carl already exists",result);
    }


    @Test
    public void emptyPasswordReturnsFalse(){
        boolean result = RegistrationUtil.validateUSer(
                "Carl",
                "",
                "1234"
        );

        assertFalse("Empty Password", result);
    }


    @Test
    public void emptyConfirmPasswordReturnsFalse(){
        boolean result = RegistrationUtil.validateUSer(
                "Carl",
                "1234",
                ""
        );

        assertFalse("Empty Confirm Password", result);
    }


    @Test
    public void validPasswordReturnsTrue(){
        boolean result = RegistrationUtil.validateUSer(
                "Carl",
                "1234",
                "1234"
        );

        assertTrue("Valid Password", result);
    }


    @Test
    public void passwordLessThan2ReturnsFalse(){
        boolean result = RegistrationUtil.validateUSer(
                "Carl",
                "1",
                "1234"
        );

        assertFalse("Password Length less than 2 characters", result);
    }


    @Test
    public void confirmPasswordLessThan2ReturnsFalse(){
        boolean result = RegistrationUtil.validateUSer(
                "Carl",
                "12",
                "1"
        );

        assertFalse("Confirm PAssword less than 2 characters", result);
    }

}