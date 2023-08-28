package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberEighteen;
import org.junit.jupiter.api.Test;

public class NumberEighteenTest {
    @Test
    void should_print_area() {
        NumberEighteen numberEighteen = new NumberEighteen(3);
        numberEighteen.printArea();
    }
}
