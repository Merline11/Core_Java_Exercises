package uk.axone.devintest.assignments.parta;

import uk.axone.devintest.assignments.parta.abstractclasses.Car;
import uk.axone.devintest.assignments.parta.abstractclasses.Vehicle;
import uk.axone.devintest.assignments.parta.interfaces.HSBC;

public class Solution2 {

    public static void main(String[] args) {
        //Phone->MobilePhone->SmartPhone->SuperPhone ->option 1
        Phone phone = new SuperPhone();


        MobilePhone mobilePhone = new MobilePhone();
        HSBC hsbc = new HSBC();
        mobilePhone.trackTransaction(hsbc);


        Vehicle vehicle = new Car("Audi"); //option 5

    }

}
