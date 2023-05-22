package uk.axone.devintest.collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("UK");
        countries.add("USA");
        countries.add("INDIA");
        countries.add("SRILANKA");
        countries.add(null);
        countries.add("INDIA");
    }
}
