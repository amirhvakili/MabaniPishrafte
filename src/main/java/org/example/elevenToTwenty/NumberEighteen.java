package org.example.elevenToTwenty;

public class NumberEighteen {

    private static final double PI = Math.PI;
    private final int r;

    public NumberEighteen(int r) {
        this.r = r;
    }

    public void printArea() {
        System.out.println(PI * r * r);
    }
}
