package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberTwenty;
import org.junit.jupiter.api.Test;

public class NumberTwentyTest {
    @Test
    void shoult_print_values() {
        NumberTwenty numberTwenty = new NumberTwenty(5, 5.2f, 6.25d, false);
        numberTwenty.print();
    }
}
