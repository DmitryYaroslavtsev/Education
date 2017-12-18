package chapter_14;

interface MyFunc2<T> {
    T func(T n);
}

public class FactorialLambdaDemo {
    public static void main(String[] args) {
        MyFunc2<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println("Факториал 3: " + factorial.func(3));
        System.out.println("Факториал 4: " + factorial.func(4));
        System.out.println("Факториал 5: " + factorial.func(5));
    }
}
