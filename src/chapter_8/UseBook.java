package chapter_8;

import bookpack.*;

public class UseBook {
    public static void main(String args[]) {
        bookpack.Book books[] = new bookpack.Book[5];
        books[0] = new Book("1","1", 1);
        books[1] = new Book("2", "2", 2);
        books[2] = new Book("3", "3",3);
        books[3] = new Book("4", "4", 4);
        books[4] = new Book("5", "5", 5);


        for (Book b: books) {b.show();}
    }
}
