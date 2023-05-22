package uk.axone.devintest.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("UK");
        countries.add("USA");
        countries.add("INDIA");
        countries.add("SRILANKA");
        countries.add(null);
        countries.add(null);
        countries.add("INDIA");

        for (String country:countries) {
            System.out.println(country);
        }
    }
}
