package uk.axone.devintest.abstractclasses;

public class Car extends Vehicle{
    public Car(String make){
        super(make);
        this.make=make;
    }
    @Override
    int getNumWheels() {

        return 0;
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    boolean isElectric() {
        return false;
    }

    @Override
    void brake() {

    }
}
