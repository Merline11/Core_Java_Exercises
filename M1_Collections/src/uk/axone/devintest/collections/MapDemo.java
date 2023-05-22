package uk.axone.devintest.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<String,String> appConfig = new HashMap<>();
        appConfig.put("URL","www.axone.uk");
        appConfig.put("username","admin");
        appConfig.put("password","123445");
        appConfig.put("password","12345");

        String value = appConfig.get("username");
        System.out.println(value);

        System.out.println("-----------------------");

        for(Map.Entry<String,String> configItem: appConfig.entrySet()){
            System.out.println(configItem.getKey() +" "+configItem.getValue());
        }

        System.out.println("-----------------------");

        Map<String,Book> bookAllocation = new TreeMap<>();
        bookAllocation.put("Ram",new Book(123,"Java for testers"));
        bookAllocation.put("Karthick",new Book(234,"Java for Developers"));
        bookAllocation.put("Hari",new Book(789,"Java for Senior"));

        Book b1 = bookAllocation.get("Ram");
        System.out.println(b1.getBookName());

        System.out.println("-----------------------");

        for(Map.Entry<String,Book> bookItem: bookAllocation.entrySet()){
            System.out.println(bookItem.getKey() +" "+bookItem.getValue().getBookName());
        }
    }

}
