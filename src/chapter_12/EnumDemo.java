package chapter_12;

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp includes TRAIN");

        switch (tp) {
            case CAR:
                System.out.println("CAR");
                break;
            case TRUCK:
                System.out.println("TRUCK");
                break;
            case AIRPLANE:
                System.out.println("AIRPLANE");
                break;
            case TRAIN:
                System.out.println("TRAIN");
                break;
            case BOAT:
                System.out.println("BOAT");
                break;
        }
    }
}
