package chapter_12;

enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;

    Transport2(int speed) {this.speed = speed; }

    int getSpeed() {return speed;}
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Airplane: " +
                Transport2.AIRPLANE.getSpeed());

        System.out.println("All:");
        for (Transport2 t: Transport2.values()) {
            System.out.println(t + ": " +
            t.getSpeed());
        }
    }
}
