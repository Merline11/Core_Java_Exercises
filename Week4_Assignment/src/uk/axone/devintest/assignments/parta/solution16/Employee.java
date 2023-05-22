package uk.axone.devintest.assignments.parta.solution16;

import java.sql.SQLOutput;

public class Employee extends Person{

    private int employeeID;
    private String designation;

    Employee(String firstName,String lastName,String gender,String address){
        super(firstName,lastName,gender,address);
    }

    Employee(String firstName,String lastName,String gender,String address,int employeeID,String designation){
        super(firstName,lastName,gender,address);
        this.employeeID = employeeID;
        this.designation = designation;

    }
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    void printInfo() {
        System.out.println("Employee ID :"+getEmployeeID());
        System.out.println("Employee Name : "+ getFirstName()+ " "+ getLastName());
        System.out.println("Employee Gender : "+getGender());
        System.out.println("Employee Address : "+ getAddress());
        System.out.println("Employee Designation : "+getDesignation());
    }

   /* String getTitle(){
        String title="";
        if(getDesignation().equalsIgnoreCase("Doctor")){
            title ="Dr.";
        } else if(getDesignation().equals("Engineer")){
            title="Er.";
        } else if(getDesignation().equals("Teacher")){
            title="Tr.";
        }
        return title;
    }*/

    void greeting(){
        System.out.println("The Employee greets you with Hi-Fi");
    }
}
