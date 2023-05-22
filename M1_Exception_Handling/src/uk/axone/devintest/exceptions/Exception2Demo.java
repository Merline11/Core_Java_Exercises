package uk.axone.devintest.exceptions;

public class Exception2Demo {

    public static void main(String[] args) {
        String strEx= null;
        try{
            String[] strArr = new String[5];
            String str = strArr[9];

            strEx.getBytes();

        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }

    }
}
