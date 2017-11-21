package Chapter_6;

class Overload {
    void ovlDemo() {
        System.out.println("Without params");
    }
    void ovlDemo(int a) {
        System.out.println("One param: " + a);
    }
    int ovlDemo(int a, int b) {
        System.out.println("Two params: " + a + " " + b);
        return a + b;
    }
    double ovlDemo(double a, double b) {
        System.out.println("Two params with type of double: " + a + " " + b);
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        ob.ovlDemo(4, 6);
        System.out.println(ob.ovlDemo(4, 6));
        System.out.println();

        ob.ovlDemo(1.1, 2.32);
        System.out.println(ob.ovlDemo(1.1, 2.32));
    }
}
