package uk.axone.devintest.testng;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite - Making a connection to MQ to inject some test data");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("@BeforeTest - opening a connection to the DB");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("@BeforeClass - Launching chrome browser and application");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@BeforeMethod - Logging into application");
    }

    @Test
    public void testFunction1(){
        System.out.println("Testing feature 1");
    }
    @Test
    public void testFunction2(){
        System.out.println("Testing feature 2");

    }
    @Test
    public void testFunction3(){
        System.out.println("Testing feature 3");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("@AfterMethod - Logging out of application");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("@AfterClass - closing a connection to the DB");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("@AfterTest - closing a connection to the DB");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite - Closing connection to MQ ");
    }
}
