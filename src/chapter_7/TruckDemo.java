package chapter_7;

class Truck extends Vehicle_Ch_7 {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }
    int getCargo() {return cargocap;}
    void putCargo(int c) {cargocap = c;}
}

public class TruckDemo {
    public static void main(String args[]) {
        Truck semi = new Truck(2,200,7,44000);
        Truck pickup = new Truck(3,28,15,2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " +
        semi.getCargo() + " фунтов");

        System.out.println("Для преодоления " + dist +
        " миль грузовику требуется " + gallons +
        " галлонов топлива\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикап может перевезти " +
                pickup.getCargo() + " фунтов");

        System.out.println("Для преодоления " + dist +
                " миль пикапу требуется " + gallons +
                " галлонов топлива\n");
    }
}
