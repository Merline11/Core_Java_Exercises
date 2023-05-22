package com.axone.assignments.module4;

public class EvenNumber {

    int number;
    public EvenNumber(int number) {
        this.number = number;
    }

    public void generate(){
        System.out.println("print the next 20 even numbers starting from the number passed in the constructor");

        for(int i = 0;i<20;i++) {
            if(number%2==0){
                System.out.println(number);
            }
        }



       /* System.out.println("print the previous 20 even numbers starting from the number passed in the constructor");
        for(int i = 1;i<=20;i++) {
            number -=2;
            System.out.println(number + "-" + i);
        }*/
    }
}
