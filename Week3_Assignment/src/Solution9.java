public class Solution9 {

    public Solution9(int num){
        this.printNumber(num);
    }

    public void printNumber(int num) {
        System.out.print(num);
    }

    public static void main(String[] args) {
        new Solution9(100).printNumber(100);
    }
}
