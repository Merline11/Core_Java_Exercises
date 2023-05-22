package uk.axone.devintest.testng;

import org.testng.annotations.Test;

public class TestNGDependencies {

    @Test
    public void launchWebsite(){
        System.out.println("Launching website");
    }

    @Test(dependsOnMethods = {"launchWebsite"})
    public void loginToWebsite(){

    }

    @Test
    public void assProductsToCart(){

    }

    @Test
    public void checkout(){

    }
}
