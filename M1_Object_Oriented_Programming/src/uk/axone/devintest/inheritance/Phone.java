package uk.axone.devintest.inheritance;

public class Phone {

    private String make;    //apple/samsung
    private String model;  //redmi8
    int price;

    void makeCall(int callNumber){
        System.out.println("Phone is making a call to "+callNumber);
    }

    void receiveCall(){
        System.out.println("Phone is receiving the call");
    }
}
