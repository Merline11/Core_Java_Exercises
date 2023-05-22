public class Solution18 {
    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        int sum = 0;
        while(start<=end){
            sum += start;
            start++;
        }
        System.out.println("sum of first 100 numbers is "+ sum);
    }
}
