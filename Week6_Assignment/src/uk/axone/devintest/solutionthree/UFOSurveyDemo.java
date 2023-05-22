package uk.axone.devintest.solutionthree;

import java.util.Arrays;
import java.util.HashSet;

public class UFOSurveyDemo {

    public static void main(String[] args) {

        UFOSurvey ufoSurvey = new UFOSurvey();
        String message;
        
        System.out.println(ufoSurvey.getAlienSightings());
        System.out.println("---------------------------------------------------------------------");

        //adding new area code with color
        message = ufoSurvey.addSighting(11,new HashSet<>(Arrays.asList("Red","Blue","Green")));
        System.out.println(ufoSurvey.getAlienSightings());
        System.out.println("Message on addSighting(new area code with colour) is changed: "+message);
        System.out.println("---------------------------------------------------------------------");

        //adding existing area code with adding different color in existing set
        message = ufoSurvey.addSighting(48,new HashSet<>(Arrays.asList("Red","Blue")));
        System.out.println(ufoSurvey.getAlienSightings());
        System.out.println("Message on addSighting(adding different color in existing set) is changed: "+message);
        System.out.println("---------------------------------------------------------------------");

        //adding existing area code with adding same color in existing set
        message = ufoSurvey.addSighting(48,new HashSet<>(Arrays.asList("Red","Blue")));
        System.out.println(ufoSurvey.getAlienSightings());
        System.out.println("Message on addSighting(adding same color in existing set) is changed: "+message);
        System.out.println("---------------------------------------------------------------------");

        //findAreasForColour - to return the set of area code based on color from the map
        System.out.println(ufoSurvey.findAreasForColour("Red"));
        System.out.println(ufoSurvey.findAreasForColour("Navy"));

    }
}
