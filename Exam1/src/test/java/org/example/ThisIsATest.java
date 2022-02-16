package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThisIsATest {

    //TODO:DEFAULT VALUES

    String name = "admin";
    String passwd = "123456789";

    userService service = new userService();

    @Test
    public void gettingTheCorrectDefaultValues(){
        System.out.println("Getting the default values -> "+name+" "+passwd); //TODO: CHANGE THE OUTPUT MESSAGE
        assertTrue(service.changePassword(name,passwd));
    }

    @Test
    public void wrongNameCorrectPasswd(){
        String name = "admin1";
        String passwd = "123456789123";
        System.out.println("Error on test because the username is -> "+name+" and passwd is ->"+passwd); //TODO: CHANGE THE OUTPUT MESSAGE
        assertFalse(service.changePassword(name,passwd));
    }

    @Test
    public void wrongNameCorrectPasswdWithAssert(){
        String name = "admin1";
        String passwd = "123456789123";
        System.out.println("Error on test because the username is -> "+name+" and passwd is ->"+passwd); //TODO: CHANGE THE OUTPUT MESSAGE
        assert(service.changePassword(name,passwd));
    }

    @Test
    public void wrongPasswordButCorrectDefaultName(){
        passwd = "12345";
        System.out.println("The passwd is false because it needs to be at least 8 digits"); //TODO: CHANGE THE OUTPUT MESSAGE
        assertFalse(service.changePassword(name,passwd));
    }

    @Test
    public void wrongNameButCorrectDefaultPassword(){
        name = "test";
        System.out.println("The correct name is admin and the name we used is -> "+name); //TODO: CHANGE THE OUTPUT MESSAGE
        assertFalse(service.changePassword(name,passwd));
    }

    @Test
    public void wrongNameAndWrongPassword(){
        name = "test";
        passwd = "1234";
        System.out.println("Test for wrong credentials"); //TODO: CHANGE THE OUTPUT MESSAGE
        assertFalse(service.changePassword(name,passwd));
    }
}
