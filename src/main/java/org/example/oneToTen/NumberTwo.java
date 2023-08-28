package org.example.oneToTen;

public class NumberTwo {
    private double a;
    private double b;

    public NumberTwo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double divsion(){
        return getA() / getB();
    }
}
