package chapter_6;

class Summator {
    int sum;

    Summator(int num) {
        sum = 0;
        for (int i = 0; i <= num ; i++) {
            sum += i;
        }
    }

    Summator(Summator ob) {
        sum = ob.sum;
    }
}

public class SumDemo {
    public static void main(String args[]) {
        Summator s1 = new Summator(5);
        Summator s2 = new Summator(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
