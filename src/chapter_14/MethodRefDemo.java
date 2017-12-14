package chapter_14;

interface IntPredicate {
    boolean test(int n);
}

class MyIntNum {
    private int v;

    MyIntNum(int x) {v = x;}
    int getNum() {return v;}

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MyIntPredicates {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n/i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

public class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(MyIntPredicates::isPrime, 17);
        if (result) System.out.println("17 is simple");

        result = numTest(MyIntPredicates::isEven, 12);
        if (result) System.out.println("12 - четное");

        result = numTest(MyIntPredicates::isPositive, 11);
        if (result) System.out.println("11 is positive");

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        if (result) System.out.println("3 - делитель " +
        myNum.getNum());

        ip = myNum2::isFactor;
        result = ip.test(3);

        if (!result) System.out.println("3 - не делитель " +
                myNum2.getNum());
    }
}
