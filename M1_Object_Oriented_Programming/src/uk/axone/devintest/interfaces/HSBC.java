package uk.axone.devintest.interfaces;

public class HSBC implements Bank{

    private String sortCode;
    private String address;

    public HSBC(){

    }
    public HSBC(String sortCode,String address){
        this.sortCode=sortCode;
        this.address=address;
    }
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
