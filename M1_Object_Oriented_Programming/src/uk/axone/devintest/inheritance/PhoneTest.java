package uk.axone.devintest.inheritance;

public class PhoneTest {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall(124);           // inherited from Phone Class
        smartPhone.playMusic();                       // inherited from Phone Class
        smartPhone.sendSMS();                         // inherited from MobilePhone Class
        smartPhone.playMusic();                       // inherited from MobilePhone Class
        smartPhone.installApp("Whatsapp");   // from SmartPhone Class
        smartPhone.useLocationServices();             // from SmartPhone Class

        smartPhone.getClass();                        // from Object Class
        smartPhone.hashCode();                        // from Object Class
        smartPhone.toString();                        // from Object Class
    }
}
