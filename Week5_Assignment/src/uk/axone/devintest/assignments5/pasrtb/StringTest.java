package uk.axone.devintest.assignments5.pasrtb;

public class StringTest {

    static String alter(String str) {
        str.concat(" altered");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(alter("STRING"));
    }
}
