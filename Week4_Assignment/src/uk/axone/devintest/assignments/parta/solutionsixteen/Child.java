package uk.axone.devintest.assignments.parta.solutionsixteen;

public class Child extends Person{

    Child(String name) {
        super(name);
    }

    @Override
    void printInfo() {
        System.out.println("Child name:"+name);
    }
}
