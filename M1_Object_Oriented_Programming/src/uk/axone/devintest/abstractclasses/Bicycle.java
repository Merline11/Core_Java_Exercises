package uk.axone.devintest.abstractclasses;

public class Bicycle extends Vehicle{
    @Override
    int getNumWheels() {
        return 2;
    }

    @Override
    String getFuelType() {
        return "Bicycle";
    }

    @Override
    boolean isElectric() {
        return false;
    }

    @Override
    void brake() {
        System.out.println("Bicycle is braking");
    }
}
