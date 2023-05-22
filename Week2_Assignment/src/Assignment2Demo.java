public class Assignment2Demo {

    public static void main1(String[] args) {

        // Code for Question 14
        int a = 10;
        double b = 20.3;
        double c = 3.14785;
        System.out.println("-------------------Solution for Question 14----------------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Code for Question 15
        boolean flag = true;
        flag = false;
        System.out.println("-------------------Solution for Question 15----------------------------");
        System.out.println(flag);

        // Code for Question 16 - for loop to print even numbers between 1 to 100
        System.out.println("-------------------Solution for Question 16----------------------------");
        for(int i=0;i<=100 && i%2==0;i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }

        /*Code for Question 17 - for loop which prints numbers from 1 to 100 but if the number is divisible by
        5, it prints 'divisible by 5 followed by that number' */
        System.out.println("-------------------Solution for Question 17----------------------------");
        for(int i=0;i<=100;i++) {
            if(i%5==0){
                System.out.println(i + " - divisible by 5 ");
            } else {
                System.out.println(i + " - not divisible by 5");
            }
        }

        // Code for Question 18 - while loop to find the sum of first 100 numbers (1 to 100)
        System.out.println("-------------------Solution for Question 18----------------------------");
        int start = 0;
        int end = 100;
        int sum = 0;
        while(start<=end){
            sum += start;
            start++;
        }
        System.out.println("sum of first 100 numbers is "+ sum);

        /* Code for Question 19 - to display following output
        1
        12
        1234
        12345
        123456
        1234567 */

        System.out.println("-------------------Solution for Question 19----------------------------");
        int size = 7; // initial size
        for(int i=1;i<=size;i++) { //print series upto the size
            for(int j=1;j<=i;j++) { //
                System.out.print(j); // print series
            }
            System.out.println(""); // for next line
        }

        int output =0;
        for(int i=1;i<=7;i++) {
            output = (output *10) + i;
            System.out.println(output);
        }

        extracted();

        // Code for Question 21 -  Rewrite the below code so that it uses a for loop.
        int total = 0;
        int number = 1;
        while(number < 20) {
            total = total + number;
            number = number + 2;
        }
        System.out.println("Adds up the first 10 odd integers using while loop : " + total);
        System.out.println("------------------Solution for Question 21----------------------------");
        int total1 = 0;
        for(int number1=1;number1<20;number1+=2){
            total1 += number1;
        }
        System.out.println("Adds up the first 10 odd integers using for loop : " + total1);

        int total2 = 0;
        int number2 = 1;
        for(int i =1;i<=10;i++) {
            total2 = total2 + number2;
            number = number +2;
        }


        // Code for Question 22 - method to generate a Random number between 1 and 100. Hint: use Math.random() utility.
        System.out.println("------------------Solution for Question 22----------------------------");
        Assignment2Demo assignment2Demo = new Assignment2Demo();
        System.out.println("Random number between 1 and 100 is : " + assignment2Demo.generateRandomNumber());
    }

    private static void extracted() {
        // Code for Question 20 - to print least and the greatest number in an array
        int[] numbers = {33,65,45,89,56,12,99,100,45,78,99,-1};
        int least = numbers[0];
        int greatest = numbers[0];

        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]>greatest) {
                greatest = numbers[i];
            } else if(numbers[i]<least){
                least = numbers[i];
            }
        }
        System.out.println("------------------Solution for Question 20----------------------------");
        System.out.println("Least number in an array is "+ least);
        System.out.println("Greatest number in an array is "+ greatest);
    }

    int generateRandomNumber(){
        int result = (int)(Math.random() * 100);
        return result;
    }

    public static void main(String[] args) {
        extracted();
    }

}
