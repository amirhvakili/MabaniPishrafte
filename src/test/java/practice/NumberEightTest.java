package practice;

import org.assertj.core.api.Assertions;
import org.example.oneToTen.NumberEight;
import org.junit.jupiter.api.Test;

public class NumberEightTest {
    @Test
    void should_print_helloName() {
        NumberEight numberEight = new NumberEight("String");
        String result = numberEight.printHelloName();
        Assertions.assertThat(result).isEqualTo("Hello String");
    }
}
