package Chapter_6;

class Rec{
    private String str;

    Rec(String s) {
        str = s;
    }

    void rec(int idx) {
        if (idx != str.length() -1 ) rec(idx + 1);
        System.out.print(str.charAt(idx));
    }

}

class SumI{
    int sum(int ... i) {
        int sum = 0;
        for (int y:i) {
            sum += y;
        }
        return sum/i.length;
    }
}

public class Test6 {
    public static void main(String args[]) {
        Rec s = new Rec("1234567890");

        s.rec(0);

        System.out.println();

        SumI sss = new SumI();
        System.out.println(sss.sum(1, 2, 3));
        System.out.println(sss.sum(1, 2, 3, 4, 5));

    }
}
