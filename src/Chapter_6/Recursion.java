package Chapter_6;

class Factorial {
    int factR(int n) {
        int result;

        if (n==1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *=t;
        }
        return result;
    }
}

public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("Рекурсия:");
        System.out.println("3! = " + f.factR(3));
        System.out.println("4! = " + f.factR(4));
        System.out.println("5! = " + f.factR(5));
        System.out.println();

        System.out.println("Итерации:");
        System.out.println("3! = " + f.factI(3));
        System.out.println("4! = " + f.factI(4));
        System.out.println("5! = " + f.factI(5));
    }
}
