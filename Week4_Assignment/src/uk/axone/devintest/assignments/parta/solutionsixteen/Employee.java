package uk.axone.devintest.assignments.parta.solutionsixteen;

public class Employee extends Person{

    Employee(String name) {
        super(name);
    }

    @Override
    void printInfo() {
        System.out.println("Employee Name: "+name);
    }

    void printSalary(int salary){
        System.out.println(name + "getting salary of Rs."+salary);
    }

    void printSalary(int salary, double bonus){
        System.out.println(name + "getting salary with bonus of Pound."+salary+bonus);
    }
}
