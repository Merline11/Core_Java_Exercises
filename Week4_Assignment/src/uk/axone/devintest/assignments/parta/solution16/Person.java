package uk.axone.devintest.assignments.parta.solution16;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private String address;

    Person(String firstName, String lastName,String gender,String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address=address;
    }

    abstract void printInfo();

    /*void getTitle(){
        return getFirstName()+" "+ getLastName();
    }*/

    void greeting(){
        System.out.println("The person greets you with Hi");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
