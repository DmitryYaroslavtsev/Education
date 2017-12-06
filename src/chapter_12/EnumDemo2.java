package chapter_12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Константы Transport");

        Transport allTranports[] = Transport.values();
        for (Transport t: allTranports) {
            System.out.println(t);
        }

        for (Transport t: Transport.values()) {
            System.out.println(t);
        }

        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp содержит " + tp);
    }
}
