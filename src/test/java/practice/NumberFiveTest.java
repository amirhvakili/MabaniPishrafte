package practice;

import org.assertj.core.api.Assertions;
import org.example.oneToTen.NumberFive;
import org.junit.jupiter.api.Test;

public class NumberFiveTest {
    @Test
    void should_print_name() {
        NumberFive numberFive = new NumberFive("String");
        String result = numberFive.print();
        Assertions.assertThat(result).isEqualTo("String");
    }
}
