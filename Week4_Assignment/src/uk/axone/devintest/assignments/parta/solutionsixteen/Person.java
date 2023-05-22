package uk.axone.devintest.assignments.parta.solutionsixteen;

public abstract class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    abstract void printInfo();

    void greeting(String action){
        System.out.println("Person is greeting in a way of "+action);
    }

    void printName(){
        System.out.println(name);
    }
}
