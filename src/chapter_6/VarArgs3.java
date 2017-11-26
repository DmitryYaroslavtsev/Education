package chapter_6;

public class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.println("Count: " + v.length);
        System.out.println("Include:");

        for (int i: v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.println("Count: " + v.length);
        System.out.println("Include:");

        for (boolean i: v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Include:");

        for (int i: v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Test: ", 10, 20);
        vaTest(true, false, false);
        //vaTest();
    }

}
