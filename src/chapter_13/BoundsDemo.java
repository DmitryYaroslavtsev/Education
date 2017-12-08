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

    boolean absEqual(NumiricFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        else return false;
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        NumiricFns<Integer> iOb = new NumiricFns<Integer>(6);

        System.out.println("Обратная величина iOb: " + iOb.recoprocal());
        System.out.println("Дробная часть iOb: " + iOb.fraction());
        System.out.println();

        NumiricFns<Double> dOb = new NumiricFns<Double>(-6.0);


        System.out.println("Обратная величина iOb: " + dOb.recoprocal());
        System.out.println("Дробная часть iOb: " + dOb.fraction());

        NumiricFns<Long> lOb = new NumiricFns<Long>(5L);

        if (iOb.absEqual(dOb))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");

        if (iOb.absEqual(lOb))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");
    }
}
