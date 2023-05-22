package uk.axone.devintest.polymorphism;

import uk.axone.devintest.abstractclasses.Car;
import uk.axone.devintest.inheritance.MobilePhone;
import uk.axone.devintest.inheritance.Phone;
import uk.axone.devintest.interfaces.HSBC;

public class HouseTest {

    public static void main(String[] args) {

        House house = new House();
        house.setName("Capital Point");
        house.setAddress("RG16QJ");
        house.setNumRooms(2);
        house.setFlat(true);

        MobilePhone mobilePhone = new MobilePhone();
        house.setPhone(mobilePhone);

        Car car = new Car("Toyota");
        house.setVehicle(car);

        HSBC hsbc = new HSBC();
        house.setBank(hsbc);
    }
}
