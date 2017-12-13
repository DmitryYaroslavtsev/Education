package chapter_14;

interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;

        myVal = () -> 98.6;
        System.out.println("Постоянное значение: " + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Обратная величина 4: " + myPval.getValue(4));

        System.out.println("Обратная величина 8: " + myPval.getValue(8));
    }
}
