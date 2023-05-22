package uk.axone.devintest.assignments5.pasrtb;

public class StringTest3 {

    static String changeBuffer(StringBuffer sbuff){
        sbuff.append(" appending text");
        sbuff.append(" to the StringBuffer");
        return sbuff.toString();
    }

    static String changeBuilder(StringBuilder sBuild){
        sBuild.append(" appending text");
        sBuild.append(" to the StringBuilder");
        return sBuild.toString();
    }

    static String changeString(String str){
        str.concat(" appending text");
        str.concat(" to the String");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(changeBuffer(new StringBuffer("This method is")));
        System.out.println(changeBuilder(new StringBuilder("This method is")));
        System.out.println(changeString(new String("This method is")));
    }
}
