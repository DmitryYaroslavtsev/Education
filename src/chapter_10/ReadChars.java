package chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Введите символы; " +
                "окончание ввода - символ точки");

        do {
            c = (char) reader.read();
            System.out.println(c);
        } while (c != '.');
    }
}
