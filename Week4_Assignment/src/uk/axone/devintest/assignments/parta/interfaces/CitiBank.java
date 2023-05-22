package uk.axone.devintest.assignments.parta.interfaces;

public class CitiBank implements Bank{
    @Override
    public void depositCash(int amount) {

    }

    @Override
    public boolean withdrawCash(int amount) {
        return false;
    }

    @Override
    public int checkBalance() {
        return 0;
    }
}
