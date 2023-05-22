package uk.axone.devintest.assignments.parta;

import uk.axone.devintest.assignments.parta.interfaces.HSBC;

public class Solution1 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.trackCall(mobilePhone); // subclass Instance


        Phone phone = new Phone();
        //mobilePhone.trackMessage(phone); // Superclass instance --> not possible
    }
}
