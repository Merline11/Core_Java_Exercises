package uk.axone.devintest.assignments.parta.solutionfifteen;

public class Numbers {
    int number;

    Numbers(int number) {
        this.number = number;
    }

    void print(){
        System.out.println("Prints all numbers upto the "+ this.number);
        for(int i=0;i<number;i++) {
            System.out.println(i);
        }
    }
}
