package org.example.elevenToTwenty;

public class NumberSixteen {
    private final String str1;
    private final String str2;

    public NumberSixteen(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void printWithTab() {
        System.out.println(str1 + "\t" + str2 + "\n");
        System.out.println(str1 + "\t" + str2);
    }
}
