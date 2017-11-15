package com.company;

public class Search {
    public static void main(String args[]) {
        int nums[] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Значание найдено!");

        String str1 = "ddfdfolddfdfdq";
        //String str2 = str1;
        String str2 = "old";

        System.out.println(str1.indexOf("old"));
    }
}
