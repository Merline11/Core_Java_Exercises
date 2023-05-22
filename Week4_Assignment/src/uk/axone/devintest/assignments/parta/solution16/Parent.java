package uk.axone.devintest.assignments.parta.solution16;

public class Parent extends Person{

    Parent(String firstName, String lastName, String gender, String address) {
        super(firstName, lastName, gender, address);
    }

    @Override
    void printInfo() {
        System.out.println("Parent Name : "+ getFirstName()+ " "+ getLastName());
        System.out.println("Parent Gender : "+getGender());
        System.out.println("Parent Address : "+ getAddress());
    }

    /*String getTitle(){
        String title="";
        if(getGender().equalsIgnoreCase("male")){
            title = "Father.";
        } else {
            title ="Mother.";
        }
        return title;
    }*/

    void greeting(){
        System.out.println("The Parent greets you with Coffee");
    }

    public void printSalary(int salary)
    {
        System.out.println("Salary without bonus : "+salary);

    }

    public void printSalary(int salary,double bonus)
    {
        System.out.println("Salary with bonus : "+(salary+bonus));

    }
    public void printSalary(double bonus,int salary)
    {
        System.out.println("Bonus with salary: "+(salary+bonus));

    }
}
