package practice;

import org.assertj.core.api.Assertions;
import org.example.NumberNine;
import org.junit.jupiter.api.Test;

public class NumberNineTest {
    @Test
    void should_print_both_strings() {
        NumberNine numberNine = new NumberNine("String 1", "String 2");
        String result = numberNine.printBoth();
        Assertions.assertThat(result).isEqualTo("String 1 String 2");
    }
}
