package com.company;

public class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);

        int range1, range2;
        int dist = 252;

        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
        System.out.println("Спорткар может перевезти " + sportcar.passengers + " пассажиров на расстояние " + range2 + " миль");

        System.out.println("Для преодоления " + dist +
                " миль мивэну требуется " + minivan.fuelneeded(dist) + " галлонов топлива");

        System.out.println("Для преодоления " + dist +
                " миль спорткару требуется " + sportcar.fuelneeded(dist) + " галлонов топлива");

    }
}
