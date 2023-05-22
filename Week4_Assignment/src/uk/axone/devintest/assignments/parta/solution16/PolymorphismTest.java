package uk.axone.devintest.assignments.parta.solution16;

public class PolymorphismTest {

    public static void main(String[] args) {
        Person employee = new Employee("Martin","Rayar","Male","RG1234");
        Person parent = new Parent("Sharmila","Martin","Female","RG406ht");
        Person child = new Child("Aaron","Jamie","Male","RG406qj");

        employee.printInfo();
        employee.greeting();
        System.out.println("---------------------------");

        parent.printInfo();
        parent.greeting();
        ((Parent) parent).printSalary(1000);
        ((Parent) parent).printSalary(1000,50.00);
        ((Parent) parent).printSalary(50.00,1000);
        System.out.println("---------------------------");

        child.printInfo();
        child.greeting();
    }
}
