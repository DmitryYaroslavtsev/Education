package chapter_13;

class NumiricFns<T extends Number> {
    T num;

    NumiricFns(T num) {
        this.num = num;
    }

    double recoprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        NumiricFns<Integer> iOb = new NumiricFns<Integer>(5);

        System.out.println("Обратная величина iOb: " + iOb.recoprocal());
        System.out.println("Дробная часть iOb: " + iOb.fraction());
        System.out.println();

        NumiricFns<Double> dOb = new NumiricFns<Double>(5.25);


        System.out.println("Обратная величина iOb: " + dOb.recoprocal());
        System.out.println("Дробная часть iOb: " + dOb.fraction());
    }
}
