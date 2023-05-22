package uk.axone.devintest.solutionone;

import java.util.*;

public class StringArrayToCollectionObjectDemo {

    public static void main(String[] args) {

        System.out.println("-----------Arrays.asList() method in java.util.Arrays class return a fixed-size list------------");

        String[] stringArray1 = {"The","Cat","sat","on","the","mat"};
        System.out.println("String array : "+Arrays.toString(stringArray1));

        List stringsList1 = Arrays.asList(stringArray1);
        System.out.println("Converted Collection :"+stringsList1);

        System.out.println("-----------Collections.addAll() method in java.util.Collections class ------------");

        String[] stringArray2 = {"The","Cat","sat","on","the","mat"};
        System.out.println(Arrays.toString(stringArray2));

        List<String> stringsList2 = new ArrayList<>();
        Collections.addAll(stringsList2,stringArray2);
        System.out.println("Converted Collection :"+stringsList2);

        System.out.println("-----------List.of() method in java.util - static method(immutable list)-UnsupportedOperationException(if we try to change). " +
                "To make mutable list specify it in constructor------------");

        String[] stringArray3 = {"The","Cat","sat","on","the","mat"};
        System.out.println(Arrays.toString(stringArray3));

       // List<String> stringsList3 = new ArrayList<>(List.of(stringArray3)); // before java 8
        List<String> stringsList3 = new ArrayList<>(Arrays.asList(stringArray3)); //after java 9
        System.out.println("Converted Collection :"+stringsList3);

        for(String s : stringArray1){
            stringsList3.add(s);
        }

        Set<String> phraseInSet = new HashSet<>();
        for(String s : stringArray1){
            phraseInSet.add(s);
        }

        Integer[] numbers = new Integer[]{1,2,3,4};
        List<Integer> numberss = Arrays.asList(numbers);


    }
}
