package uk.axone.devintest.assignments5.pasrtb;

public class ExceptionTest1 {

    public static void main(String[] args) {
        int i=0;

        try{
            Integer.parseInt("hello");
            i = 1;
        } catch(Exception ex){
            i = 2;
        } finally {
            i = 3;
        }
        System.out.println(i);
    }
}
