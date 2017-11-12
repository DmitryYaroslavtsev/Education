package com.company;

import java.io.IOException;

public class CaseChg {
    public static void main(String args[]) throws IOException {
        char ch, ignore;
        int count = 0;

        System.out.println("Для остановки введите точку");

        do {
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if ((ch >= 'A') && (ch <= 'Z')) {
                ch += 32;
                System.out.println(ch + " ");
                count++;
            }
            else if ((ch >= 'a') && (ch <= 'z')) {
                ch -= 32;
                System.out.println(ch + " ");
                count++;
            }
        } while (ch != '.');
        System.out.println(count);
    }
}
