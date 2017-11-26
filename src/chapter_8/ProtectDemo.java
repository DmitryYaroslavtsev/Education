package chapter_8;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t,a,d);
        publisher = p;
    }
    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String p) {
        publisher = p;
    }
    public String getTitle() {return title;}
    public void setTitle(String t)  {
        title = t;
    }
    public String getAuthor() {return author;}
    public void setAuthor(String a) {author = a;}
    public int getPubDate() {return pubDate;}
    public void setPabDate(int d) {pubDate = d;}
}

class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("1", "1", 1, "1");
        books[1] = new ExtBook("2", "2", 2, "2");
        books[2] = new ExtBook("3", "3", 3, "3");
        books[3] = new ExtBook("4", "4", 4, "4");
        books[4] = new ExtBook("5", "5", 5, "5");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
