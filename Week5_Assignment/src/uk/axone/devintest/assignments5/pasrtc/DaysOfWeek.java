package uk.axone.devintest.assignments5.pasrtc;

import java.util.Arrays;

public class DaysOfWeek {

    private final static String[] day= new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};

    public DaysOfWeek(String value) throws InvalidDayException{

        if(!Arrays.asList(day).contains(value)){
            throw new InvalidDayException("Invalid day passed, please use a valid day");
        }
        for (int i = 0; i < day.length; i++) {
            if(!day[i].equals(value)){
                throw new InvalidDayException("Invalid day passed, please use a valid day");
            }
        }
    }


}
