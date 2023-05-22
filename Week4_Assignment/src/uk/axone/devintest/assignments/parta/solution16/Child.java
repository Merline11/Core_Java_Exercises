package uk.axone.devintest.assignments.parta.solution16;

public class Child extends Person{

    Child(String firstName, String lastName, String gender, String address) {
        super(firstName, lastName, gender, address);
    }

    @Override
    void printInfo() {
        System.out.println("Child Name : "+ getFirstName()+ " "+ getLastName());
        System.out.println("Child gender : "+getGender());
        System.out.println("Child Address : "+ getAddress());
    }

   /* String getTitle(){
        String title="";

        return title;
    }*/

    void greeting(){
        System.out.println("The Child greets you with Hug");
    }
}
