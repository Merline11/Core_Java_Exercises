package uk.axone.devintest.assignments.parta.solutionfifteen;

public class Driver {

    public static void main(String[] args) {
        Numbers numbers = new Numbers(50);
        OddNumbers oddNumbers = new OddNumbers(50);
        EvenNumbers evenNumbers = new EvenNumbers(50);

        numbers.print();
        oddNumbers.print();
        evenNumbers.print();
    }
}
