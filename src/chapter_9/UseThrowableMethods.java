package chapter_9;

class ExcTest1 {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before");
        nums[7] = 10;
        System.out.println("Never showed");
    }
}

public class UseThrowableMethods {
    public static void main(String args[]) {
        try {
            ExcTest1.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standart msg");
            System.out.println(exc);
            System.out.println("\nStack trace");
            exc.printStackTrace();
        }
        System.out.println("After");
    }
}
