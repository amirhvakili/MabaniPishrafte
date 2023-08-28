package org.example.elevenToTwenty;

public class NumberSeventeen {

    private final int number1;
    private final int number2;

    public NumberSeventeen(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSum(){
        return number1 + number2;
    }

    public void printAll() {
        System.out.println(number1 + " " + "+" + " " + number2 + " = " + getSum());
    }
}
