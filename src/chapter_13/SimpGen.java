package chapter_13;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes() {
        System.out.println("T is " +
                ob1.getClass().getName());
        System.out.println("V is " +
                ob2.getClass().getName());
    }

    T getOb1() {return ob1;}
    V getOb2() {return ob2;}
}

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Test");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Value: " + v);

        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
}
