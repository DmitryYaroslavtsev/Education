package chapter_8;

public class UseBook {
    public static void main(String args[]) {
        bookpack.Book books[] = new bookpack.Book[5];
        books[0] = new bookpack.Book("1","1", 1);
        books[1] = new bookpack.Book("2", "2", 2);
        books[2] = new bookpack.Book("3", "3",3);
        books[3] = new bookpack.Book("4", "4", 4);
        books[4] = new bookpack.Book("5", "5", 5);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
