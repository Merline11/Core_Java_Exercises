package uk.axone.devintest.strings;

public class StringDemo {
    public static void main(String[] args) {

        String sr = new String("Axone");

        char[] chrArr = {'A','X','O','N','E'};
        String str1=new String(chrArr);

        String str2 = "Axone";
        System.out.println(str2.concat("Training"));
        System.out.println(str2.concat("Solutions"));

        //String is immutable(unchangable)->once string is created cannot be changed
        System.out.println(str2); // o/p: Axone

        System.out.println("--------------------------------");

        StringBuilder sBuild = new StringBuilder("Axone");
        System.out.println(sBuild.append("Training"));
        System.out.println(sBuild.append("Solutions"));
        System.out.println(sBuild);
    }
}
