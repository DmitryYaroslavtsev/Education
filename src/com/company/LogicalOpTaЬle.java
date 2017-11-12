package com.company;


public class LogicalOpTaЬle {
    public static void main(String args[]) {
        boolean p,q;
        byte ip,iq;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = false; q = false;
        if (p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (p&q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p|q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p^q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (!p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        System.out.println();

        p = false; q = true;
        if (p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (p&q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p|q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p^q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (!p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        System.out.println();

        p = true; q = false;
        if (p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (p&q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p|q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p^q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (!p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        System.out.println();

        p = true; q = true;
        if (p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (p&q) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p|q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if ((p^q)) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        if (!p) { System.out.print("1" + "\t\t");} else {System.out.print("0" + "\t\t");}
        System.out.println();
    }
}
