package uk.axone.devintest.testng;

import org.testng.annotations.Test;

public class TestNGOrderOfExecution {

    @Test(priority = 0)
    public void login(){
        System.out.println("Login in");
    }

    public void validateHomePage(){
        System.out.println("Validating home page");
    }

    public void logout(){
        System.out.println("Logging out");
    }
}
