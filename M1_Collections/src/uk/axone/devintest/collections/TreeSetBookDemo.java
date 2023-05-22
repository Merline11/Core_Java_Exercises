package uk.axone.devintest.collections;

import java.util.*;

public class TreeSetBookDemo {

    public static void main(String[] args) {
        Set<Book> myBooks = new TreeSet<>();
        myBooks.add(new Book(123,"I love Java"));
        myBooks.add(new Book(234,"Selenium Rocks"));
        myBooks.add(new Book(345,"Cucumber is cool"));

        for (Book book:myBooks){
            System.out.println(book.getBookID() + " " + book.getBookName());
        }
    }
}
