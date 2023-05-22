package uk.axone.devintest.operators;

import java.util.Scanner;

public class OperatorsDemo {

    //score between 0 and 30 = No grade
    //score between 30 and 60 = Grade C
    //score between 60 and 80 = Grade B
    //score between 80 and 100 = Grade A
    //Score less than 0 and greater than 100= Invalid Score

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = scan.nextInt();

        if(score>=0 && score <30){
            System.out.println("No grade");
        } else if (score>=30 && score <60) {
            System.out.println("Grade C");
        } else if (score>=60 && score <80) {
            System.out.println("Grade B");
        } else if (score>=80 && score <100) {
            System.out.println("Grade A");
        }
        if(score>0 || score <100){
            System.out.println("Invalid Score");
        }

    }
}
