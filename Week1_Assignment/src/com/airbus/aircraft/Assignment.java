package com.airbus.aircraft;

public class Assignment {

    public void displayText() {
        System.out.println("Java Programming is fun");
    }

    public void displayNumbers(){
        System.out.println("10,20,30");
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        assignment.displayText();
    }
}
