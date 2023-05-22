package uk.axone.devintest.assignments.parta.solutionsixteen;

public class Parent extends Person{

    Parent(String name) {
        super(name);
    }

    @Override
    void printInfo() {
        System.out.println("Parent Name : "+name);

    }
}
