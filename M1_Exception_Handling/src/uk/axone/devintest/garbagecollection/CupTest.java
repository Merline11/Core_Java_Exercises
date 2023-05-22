package uk.axone.devintest.garbagecollection;

public class CupTest {

    public static void main(String[] args) {

        Cup cup1 = new Cup("red");
        Cup cup2 = new Cup("green");
        Cup cup3 = new Cup("blue");

        cup1=cup2;
        cup2=cup3;
        cup3=cup1;

        System.out.println(cup3.getColor());
    }
}
