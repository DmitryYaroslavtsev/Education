package chapter_7;

class Aa {
    int i, j;

    Aa(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class Bb extends Aa {
    int k;

    Bb(int a, int b, int c) {
        super(a, b);
        k = c;
    }
//    void show() {
//        System.out.println("k: " + k);
//    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override {
    public static void main(String args[]) {
        Bb subOb = new Bb(1, 2, 3);
        subOb.show();
        subOb.show("k: ");
    }
}
