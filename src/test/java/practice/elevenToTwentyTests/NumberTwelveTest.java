package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberTwelve;
import org.junit.jupiter.api.Test;

public class NumberTwelveTest {
    @Test
    void should_convert_int_to_double() {
        NumberTwelve numberTwelve = new NumberTwelve(20);
        double number = numberTwelve.toDouble();
        System.out.println(number);
    }
}
