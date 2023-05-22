package uk.axone.devintest.collections;

public class Book implements Comparable<Book>{

    private int bookID;
    private String bookName;

    public Book(int bookID, String bookName) {
        this.bookID = bookID;
        this.bookName = bookName;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

   /* public int compareTo(Book anotherBook) {
        //comparison based on bookID

        if(this.bookID > anotherBook.bookID) {
            return -1;
        } else if(this.bookID < anotherBook.bookID) {
            return 1;
        } else {
            return 0;
        }

    } */

    public int compareTo(Book anotherBook) {
        //comparison based on bookID
        return bookName.compareTo(anotherBook.bookName);

    }
}
