package org.example.elevenToTwenty;

public class NumberEleven {

    private final int integer;
    private final double number;
    private final char ch;
    private final boolean bool;
    private final String str;

    public NumberEleven(int integer, double number, char ch, boolean bool, String str) {
        this.integer = integer;
        this.number = number;
        this.ch = ch;
        this.bool = bool;
        this.str = str;
    }

    public void print() {
        System.out.println(integer);
        System.out.println(number);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(str);
    }
}
