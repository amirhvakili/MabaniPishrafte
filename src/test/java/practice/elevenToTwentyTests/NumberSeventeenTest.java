package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberSeventeen;
import org.junit.jupiter.api.Test;

public class NumberSeventeenTest {
    @Test
    void print_all_three() {
        NumberSeventeen numberSeventeen = new NumberSeventeen(10, 20);
        numberSeventeen.printAll();
    }
}
