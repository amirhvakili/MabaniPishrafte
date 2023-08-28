package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberThirteen;
import org.junit.jupiter.api.Test;

public class NumberThirteenTest {
    @Test
    void print_int() {
        NumberThirteen numberThirteen = new NumberThirteen(9.78);
        numberThirteen.printInt();
    }
}
