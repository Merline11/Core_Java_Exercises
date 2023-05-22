package uk.axone.devintest.flowcontrol;
public class FlowControl {

    void useIfElse(String day){

        //mon,tue,wed -> print weekday
        //thurs - print midweek
        //fri - thank god its friday
        //sat/sun -weekend
        //invalid input

        /* == for primitive data types not for reference types

        if(day == "Mon" || day == "Tue" || day == "Wed"){
            System.out.println("Weekday");
        }*/

        if(day.equals("Mon") || day.equals("Tue") || day.equals("Wed")) {
            System.out.println("Weekday");
        } else if (day.equals("thurs")) {
            System.out.println("midweek");
        } else if (day.equals("fri")) {
            System.out.println("thank god its friday");
        } else if (day.equals("sat") || day.equals("sun")) {
            System.out.println("weekend");
        } else  {
            System.out.println("invalid input");
        }

    }

    void useSwitch(String day) {

        switch(day){

            case "mon":
            case "tue":
            case "wed":
                System.out.println("Weekday");
                break;
            case "thur":
                System.out.println("midweek");
                break;
            case "fri":
                System.out.println("thank god its friday");
                break;
            case "sat":
            case "sun":
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid output");
        }
    }

    public static void main(String[] args) {
        FlowControl flowControl = new FlowControl();
        flowControl.useIfElse("fri");
        flowControl.useSwitch("hi");
    }
}
