package Chapter_7;

class A {
    int i;
}

class B extends A {
    private int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superClass: " + super.i);
        System.out.println("i in subClass: " + i);
    }
}

public class UseSuper {
    public static void main(String args[]) {
        B ob = new B(1, 2);
        ob.show();

    }
}
