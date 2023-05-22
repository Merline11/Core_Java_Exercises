public class LoopDemo {

    //calculate the sum of 1,2,3,....+n
    int useDoWhile(int n){
        int sum = 0;
        int count=0;
        do{
            System.out.println("Enter doWhile loop"+count);
            sum += count;
            count++; //count=count+1;
        }while (n>=count);

        return sum;
    }

    int useWhile(int n) {
        int sum = 0;
        int count=0;
        while(n>=count) {
            System.out.println("Enter while loop"+count);
            sum += count;
            count++;
        }
        return sum;
    }

    int useForLoop(int n) {
        int sum=0;
        for(int count=0;count>=sum;count++){
            sum +=count;
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopDemo loopDemo = new LoopDemo();
        System.out.println(loopDemo.useDoWhile(5)); //5+4+3+2+1 =15
        System.out.println(loopDemo.useWhile(10));
        System.out.println(loopDemo.useForLoop(10));
    }
}
