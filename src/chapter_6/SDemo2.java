package chapter_6;

class StaticMeth {
    static int val = 1024;
    static int valDiv2() {
        return val/2;
    }
}

public class SDemo2 {
    public static void main(String args[]) {
        System.out.println(StaticMeth.val);
        System.out.println(StaticMeth.valDiv2());
        System.out.println();
        StaticMeth.val = 4;
        System.out.println(StaticMeth.val);
        System.out.println(StaticMeth.valDiv2());
    }
}
