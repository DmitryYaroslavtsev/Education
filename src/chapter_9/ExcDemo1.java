package chapter_9;

public class ExcDemo1 {
    public static void main(String args[]) {
        int nums[] = new int[4];

        try {
            System.out.println("Before");
            nums[7] = 10;
            System.out.println("Non visible");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of index");
        }
        System.out.println("After catch");
    }
}
