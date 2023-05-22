package uk.axone.devintest.assignments.parta.abstractclass.solutiontwelve;

import java.util.Date;

public class DevInTest extends Course{
    @Override
    String[] getTrainers() {
        return new String[]{"Sridevi","Karthik","Ram"};
    }

    @Override
    Date StartDate() {
        return new Date();
    }

    @Override
    int getDuration() {
        return 12;
    }

    int getNumAssignments(){
        return 15;
    }

    public static void main(String[] args) {
        Course sepBatch = new DevInTest();
        sepBatch.getTrainers();
        //sepBatch.getNumAssignments();
    }
}
