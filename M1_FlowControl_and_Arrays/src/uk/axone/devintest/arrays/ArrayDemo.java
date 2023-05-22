
package uk.axone.devintest.arrays;
public class ArrayDemo {

    public static void main(String[] args) {
        String[] testTools = new String[5];
        testTools[0] = "Selenium";
        testTools[1] = "Cucumber";
        testTools[2] = "Appium";
        testTools[3] = "RestAssured";
        testTools[4] = "JBehave";

        for(int i=0;i<testTools.length;i++){
            System.out.println(testTools[i]);
        }

        String[] progLangs = {"Java","C++","JavaScript"};

        Car[] cars = new Car[3];
    }

}
