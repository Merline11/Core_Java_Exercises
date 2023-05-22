package uk.axone.devintest.exceptions;

public class Voter {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Maximum Voter Age is 18");
        } else if (age>120) {
            throw new InvalidAgeException("Maximum Voter Age is 120");
        } else{
            this.age = age;
        }

    }
}
