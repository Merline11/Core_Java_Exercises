package uk.axone.devintest.abstractclasses;

public abstract class Vehicle {
    String make;
    public Vehicle(){

    }
    public Vehicle(String make){
        this.make=make;
    }

    //Abstract Methods
    abstract int getNumWheels();
    abstract String getFuelType();
    abstract boolean isElectric();
    abstract void brake();

    //non abstract methods
    void moveForward(){
        System.out.println("Vehicle is moving forward");
    }
}
