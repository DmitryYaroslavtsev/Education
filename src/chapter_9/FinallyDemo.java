package chapter_9;

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Получуно " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("Div to zero");
            return;
        }
        catch (ArrayIndexOutOfBoundsException ext) {
            System.out.println("Out of index");
        }
        finally {
            System.out.println("Exit from TRY");
        }
    }
}

public class FinallyDemo {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
