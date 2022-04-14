package com.netcracker.ch2;

public class Main {
    public static void main(String[] args) {
        pointTest();
        carTest();
    }

    public static void pointTest() {
        System.out.println("POINT TEST");

        Point point = new Point(3, 4);
        System.out.println("Point: " + point);

        Point point1 = point.translate(1, 3).scale(0.5);
        System.out.println("New point: " + point1);

        System.out.println("================================================");
    }

    public static void carTest() {
        System.out.println("CAR TEST");

        Car car = new Car( 5, 30);
        System.out.println(car);
        car.addGas(30);
        car.drive(150);

        System.out.println("================================================");
    }
}
