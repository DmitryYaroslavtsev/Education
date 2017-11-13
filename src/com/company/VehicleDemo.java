package com.company;

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        int range;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}
