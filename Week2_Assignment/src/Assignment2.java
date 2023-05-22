public class Assignment2 {
    public static void main(String[] args) {
        Assignment2 p = new Assignment2();
        p.start(); //Solution for Question 5

        System.out.println("-----------------Solution for Question 10------------------------------");
        /*
        Solution for Question 6
        boolean b = false;
        int i = 90;
        System.out.println(i>=b);
         */

        System.out.println("-----------------Solution for Question 10------------------------------");
        //Solution for Question 10
        int num = 120;
        switch(num) {
            default :
                System.out.println("default");
            case 0:
                System.out.println("case1");
            case 10*2:
                System.out.println("case2");
                break;
        }
        System.out.println("-------------------Solution for Question 11----------------------------");
        //Solution for Question 11
        int a[][] = new int[10][5];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
                a[i][j] = i * j;
            }
        }

        System.out.println(a[0][0]);
        System.out.println(a[1][3]);
        System.out.println(a[3][4]);

        System.out.println("-------------------Solution for Question 12----------------------------");
        //Solution for Question 12
        int x = 0;
        while(true) {
            x = increment(x);
            System.out.println("Value of x is --" + x);
            if(x>10)
                break;
        }

        System.out.println("-------------------Solution for Question 13----------------------------");
        //Solution for Question 13
        int i = 2;
        while(makeDecision(i)) {
            i = i * i;
            System.out.println(i);
        }

    }

    public  static boolean makeDecision(int i) {
        if(i % 3 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int increment(int i){
        return i + 1;
    }

    void start() {
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }

    boolean fix(boolean b1) {
        b1 = true;
        return b1;
    }
}
