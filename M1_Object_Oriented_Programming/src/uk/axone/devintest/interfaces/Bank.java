package uk.axone.devintest.interfaces;

public interface Bank {

    public static final int FIN_INST_TYPE=1;
    int SEC_INST_TYPE=1;
    public abstract void depositCash(int amount);
    boolean withdrawCash(int amount);
    int checkBalance();
}
