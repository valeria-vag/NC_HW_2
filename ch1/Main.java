package com.netcracker.ch1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //angleTest();
        //factorialTest();
        //stringTest();
        //lotteryTest();
        //matrixTest();
    }

    public static void angleTest() {
        System.out.println("NORMALIZE ANGLE");
        Ex2 ex2 = new Ex2();
        int angle = ex2.scanAngle();

        System.out.println("Normalize angle = " + ex2.normalizeAngle(angle));
        System.out.println("Normalize with FloorMod = " + ex2.normalizeAngleFloorMod(angle));

        System.out.println("================================================");
    }

    public static void factorialTest() {
        System.out.println("FACTORIAL");
        System.out.println("1000! = " + Ex6.factorial(1000));

        System.out.println("================================================");
    }

    public static void stringTest() {
        System.out.println("STRING");

        Ex8 ex8 = new Ex8();
        String s = ex8.scanString();
        ex8.printSubstrings();
        System.out.println("================================================");
    }

    public static void lotteryTest() {
        System.out.println("LOTTERY");

        Ex13 lotteryString = new Ex13();
        lotteryString.combination();

        System.out.println("================================================");
    }

    public static void matrixTest() {
        System.out.println("");
        System.out.println("================================================");
    }
}
