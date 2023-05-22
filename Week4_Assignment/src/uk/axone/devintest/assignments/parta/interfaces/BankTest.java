package uk.axone.devintest.assignments.parta.interfaces;

public class BankTest {
    public static void main(String[] args) {

        System.out.println(Bank.FIN_INST_TYPE);

        HSBC hsbc = new HSBC("4043","High Court");
        hsbc.depositCash(12345);
        hsbc.withdrawCash(12345);
        hsbc.checkBalance();

    }
}
