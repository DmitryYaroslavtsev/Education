package chapter_9;

class ExcTest {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before");
        nums[7] = 10;
        System.out.println("Never show");
    }
}

public class ExcDemo2 {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of index!");
        }
        System.out.println("After catch");
    }
}
