package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberEleven;
import org.junit.jupiter.api.Test;

public class NumberElevenTest {
    @Test
    void should_print_values() {
        NumberEleven numberEleven = new NumberEleven(5, 5.5, 'c', true, "str");
        numberEleven.print();
    }
}
