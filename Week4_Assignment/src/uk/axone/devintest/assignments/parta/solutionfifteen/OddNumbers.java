package uk.axone.devintest.assignments.parta.solutionfifteen;

public class OddNumbers extends Numbers{

    OddNumbers(int number) {
        super(number);
    }

    void print(){
        System.out.println("Prints all Odd number upto the "+ this.number);
        for(int i=0;i<=number;i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
