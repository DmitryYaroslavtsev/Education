package com.company;

public class ShowBits1 {
    public static void main(String args[]) {
        byte val = 123;

        for (int i = 128; i > 0; i/=2) {
            if ((val & i) != 0) System.out.print("1");
            else System.out.print("0");
        }
    }
}
