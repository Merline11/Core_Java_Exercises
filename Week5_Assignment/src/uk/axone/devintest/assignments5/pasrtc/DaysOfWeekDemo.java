package uk.axone.devintest.assignments5.pasrtc;

public class DaysOfWeekDemo {

    public static void main(String[] args)  {
        try {
            DaysOfWeek wed = new DaysOfWeek("WED");
            //System.out.println(wed.getDay());

            DaysOfWeek uk = new DaysOfWeek("UK");
            //System.out.println(uk.getDay());

        } catch (InvalidDayException ide) {
            System.out.println(ide.getMessage());
        }
    }
}
