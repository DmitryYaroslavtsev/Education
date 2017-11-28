package chapter_9;

public class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("Перехвачено!");
        }
        System.out.println("After");
    }
}
