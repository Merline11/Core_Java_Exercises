package uk.axone.devintest.exceptions;

public class VoterDemo {

    public static void main(String[] args) throws InvalidAgeException {
        Voter merline = new Voter();
        merline.setAge(-25);
    }
}
