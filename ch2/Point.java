package com.netcracker.ch2;

public final class Point {

    private double x = 0;
    private double y = 0;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Point translate(double x, double y) {
        return new Point(this.getX() + x, this.getY() + y);
    }

    public Point scale(double koef) {
        return new Point(koef * this.getX(), koef * this.getY());
    }
}
