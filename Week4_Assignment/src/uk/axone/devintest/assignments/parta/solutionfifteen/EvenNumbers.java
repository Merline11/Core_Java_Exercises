package uk.axone.devintest.assignments.parta.solutionfifteen;

public class EvenNumbers extends Numbers{

    EvenNumbers(int number) {
        super(number);
    }

    void print(){
        System.out.println("Prints all Even number upto the "+ this.number);
        for(int i=0;i<=number;i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
