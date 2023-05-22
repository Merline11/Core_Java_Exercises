package uk.axone.devintest.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGMultipleTests {

    @Test
    public void test1(){
        startTest();
        System.out.println("Running test 1");
    }
    @Test
    @Ignore
    public void test2(){
        startTest();
        System.out.println("Running test 2");
    }
    @Test(enabled=false)
    public void test3(){
        startTest();
        System.out.println("Running test 3");
    }

    private void startTest(){
        System.out.println("Starting test");
    }
}
