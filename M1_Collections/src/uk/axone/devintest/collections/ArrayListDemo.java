package uk.axone.devintest.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> herbs = new ArrayList<>();
        herbs.add("Thyme");
        herbs.add("Basil");
        herbs.add("Rosemary");
        herbs.add("Coriander");
        herbs.add("Coriander");

         herbs.remove(2);
         herbs.add(1, "mint");
         herbs.set(0,"ray");
    }
}
