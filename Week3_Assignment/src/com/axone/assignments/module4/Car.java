package com.axone.assignments.module4;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private String regNum;
    private String fuelType;

    public static int noWheels;
    public final static int VTYPE=1;

    public Car(){

    }

    public Car(String regNum){
        this.regNum = regNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public static int getNoWheels() {
        return noWheels;
    }

    public static void setNoWheels(int noWheels) {
        Car.noWheels = noWheels;
    }

    public void print(){
        System.out.println("make : "+make);
        System.out.println("model : "+model);
        System.out.println("regNum : "+regNum);
        System.out.println("fuelType : "+fuelType);
        System.out.println("noWheels : "+noWheels);
        System.out.println("VTYPE : "+VTYPE);
    }

    public static void main(String[] args) {
        Car car = new Car("1001");
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setFuelType("Biodiesel");
        car.setRegNum("12345TVRK");
        Car.setNoWheels(4);
        car.print();
    }

}
