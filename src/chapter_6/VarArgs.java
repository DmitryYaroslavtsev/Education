package chapter_6;

public class VarArgs {

    static void vaTets(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Include:");

        for (int a: v) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        vaTets("One: ", 10);
        vaTets("Three: ",1, 2, 3);
        vaTets("Zero: ");
    }
}
