package chapter_9;

import java.io.*;

public class ThrowsDemo {
    public static char prompt(String str)
        throws IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;

        try {
            ch = prompt("Enter a letter");
        }
        catch (IOException exc) {
            System.out.println("IO exc");
            ch = 'X';
        }
        System.out.println("You input " + ch);
    }
}
