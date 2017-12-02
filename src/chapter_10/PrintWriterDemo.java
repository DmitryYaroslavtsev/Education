package chapter_10;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.56;

        pw.println("Использование:");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i + d));
    }
}
