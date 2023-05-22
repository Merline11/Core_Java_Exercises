public class SpecialCharacter {

    public void printCharacter(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    /*12)	Write a Java class to display the following output
        ++++++
        @@@@@@
        ******
        ######*/
    public static void main(String[] args) {

        System.out.println("++++++");
        System.out.println("@@@@@@");
        System.out.println("******");
        System.out.println("######");

        System.out.println("----------------------------------------");

        SpecialCharacter sc = new SpecialCharacter();
        sc.printCharacter('+', 5);
        sc.printCharacter('@', 5);
        sc.printCharacter('*', 5);
        sc.printCharacter('#', 5);

    }
}
