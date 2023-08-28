package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberSixteen;
import org.junit.jupiter.api.Test;

public class NumberSixteenTest {
    @Test
    void should_print_hello_world() {
        NumberSixteen numberFifteen = new NumberSixteen("Hello", "World");
        numberFifteen.printWithTab();
    }
}
