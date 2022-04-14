package com.netcracker.ch2;

public class Car {
    private double x;
    private double gas;
    private double efficiency;

    public Car(double gas, double efficiency) {
        this.gas = gas; //gallons
        this.efficiency = efficiency;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public void addGas(double gas) {
        this.gas += gas; //add new gas to current
    }

    public void drive(double x) {
        double needGas = Math.abs(x / this.efficiency);
        if (needGas < this.gas) {
            this.x = this.x + x;
            this.gas -= needGas;
            System.out.println("After " + x + " miles will be " + gas + " gallons gas left");
        } else {
            System.out.println("Low gas!");
        }
    }


    public double getEfficiency() {
        return x / gas;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "Car: " +
                "x = " + x +
                ", gas = " + gas +
                ", efficiency = " + efficiency;
    }
}
