package com.company;

import java.io.IOException;

public class Spaces {
    public static void main(String args[]) throws IOException {
        char ch;
        int spaces = 0;

        System.out.println("Для остановки введите симво точки .");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');

        System.out.println("Количество пробелов - " + spaces);
    }
}
