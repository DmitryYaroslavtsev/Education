package chapter_12;

import static java.lang.Math.*;
//import static java.lang.Math.pow;

public class Qadratic {
    public static void main(String[] args) {
        double a, b, c, x;

        //4x2 + bx - 3 = 0
        a = 4;
        b = 1;
        c = -3;

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) /
                (2 * a);
        System.out.println("x1 = " + x);

        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) /
                (2 * a);
        System.out.println("x2 = " + x);
    }
}
