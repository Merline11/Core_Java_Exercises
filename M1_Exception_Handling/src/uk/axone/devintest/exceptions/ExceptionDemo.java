package uk.axone.devintest.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {
        String strEx= null;
        try{
           /* int x = 10;
            int y = 2;
            int z = x/y;*/

            String[] strArr = new String[5];
            String str = strArr[8];

            strEx.getBytes();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("finally block");
        }
    }
}
