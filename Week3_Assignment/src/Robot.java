public class Robot {

    public final int numberFunctions = 7;
    private static String latestModel = "ASMIO";

    public static void main(String[] args) {
        Robot robot1 = new Robot();
        int value = robot1.numberFunctions;
        Robot robot2 = robot1;
        int robot2Value = robot2.numberFunctions;
    }
}
