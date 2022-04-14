package com.netcracker.ch1;

import java.util.Scanner;

public class Ex2 {
    private int angle;

    public int scanAngle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter angle:");
        angle = scanner.nextInt();
        return angle;
    }

    public int normalizeAngle(int angle) {
        int result = angle % 360;
        return (result < 0) ? result + 360 : result;
    }

    public int normalizeAngleFloorMod(int angle) {
        int result = Math.floorMod(angle, 360);
        return (result < 0) ? result + 360 : result;
    }
}
