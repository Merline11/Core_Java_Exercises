public class Solution20 {

    public static void main(String[] args) {
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
}
