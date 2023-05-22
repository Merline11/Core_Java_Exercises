package uk.axone.devintest.assignments5.pasrtb;

public class ExceptionTest2 {

    public static void main(String[] args) {
        try{
            System.out.println("I'm a try block");
        }catch(Exception ex){
            System.out.println("I'm a catch block");
        }finally{
            System.out.println("I'm a finally block");
        }
    }


}
