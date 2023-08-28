package org.example.elevenToTwenty;

public class NumberTwenty {
    private final int i;
    private final float v;
    private final double v1;
    private final boolean b;

    public NumberTwenty(int i, float v, double v1, boolean b) {
        this.i = i;
        this.v = v;
        this.v1 = v1;
        this.b = b;
    }


    public void print() {
        System.out.println(i + " " + v + " " + " " + v1 + " " + b);
    }
}
