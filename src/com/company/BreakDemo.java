package com.company;

public class BreakDemo {
    public static void main(String args[]) {
        int x, y;

        stop1: for (x = 0; x < 5; x++) {
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop1;
                    System.out.println("x и y: " + x + " " + y);
                }
        }

        System.out.println();

        for (x = 0; x < 5; x++)
     stop2: {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop2;
                System.out.println("x и y: " + x + " " + y);
            }
     }
    }
}
