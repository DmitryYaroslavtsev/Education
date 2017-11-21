package Chapter_6;

class MyClass1 {
    int x;

    MyClass1() {
        System.out.println("MyClass1()");
        x = 0;
    }
    MyClass1(int i) {
        System.out.println("MyClass1(int)");
        x = i;
    }
    MyClass1(double d) {
        System.out.println("MyClass1(double)");
        x = (int) d;
    }
    MyClass1(int i, int j) {
        System.out.println("MyClass1(int, int)");
        x = i * j;
    }
}

public class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass1 t1 = new MyClass1();
        MyClass1 t2 = new MyClass1(88);
        MyClass1 t3 = new MyClass1(17.23);
        MyClass1 t4 = new MyClass1(2, 4);

        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t3.x);
        System.out.println(t4.x);
    }
}
