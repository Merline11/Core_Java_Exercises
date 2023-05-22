package uk.axone.devintest.assignments.parta.abstractclass.solutiontwelve;

import java.util.Date;

abstract class Course {
    abstract String[] getTrainers();
    abstract Date StartDate();
    abstract int getDuration();

    boolean isOnline(){
        return true;
    }

    String deliveryMode(){
        return "Webex";
    }
}
