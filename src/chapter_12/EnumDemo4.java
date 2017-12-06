package chapter_12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp1, tp2, tp3;

        System.out.println("Константы и значения:");
        for (Transport t: Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        if (tp1.compareTo(tp2) < 0) {
            System.out.println(tp1 + " идет перед "+ tp2);
        }

        if (tp1.compareTo(tp2) > 0) {
            System.out.println(tp2 + " идет перед "+ tp1);
        }

        if (tp1.compareTo(tp3) == 0) {
            System.out.println(tp1 + " совпадает "+ tp3);
        }
    }
}
