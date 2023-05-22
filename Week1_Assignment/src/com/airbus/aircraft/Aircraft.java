package com.airbus.aircraft;
public class Aircraft {

    public Aircraft(String name) {
        System.out.println(name);
    }

    public void takeOff(){
        System.out.println("Aircraft is taking off");
    }

    public String landing(int number){
        return "Aircraft Landing";
    }

    public static void main(String[] args) {
        Aircraft A380 = new Aircraft("Aerodrome");
        A380.takeOff();
        A380.landing(45);

    }
}
