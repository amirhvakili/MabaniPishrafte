package practice;

import org.assertj.core.api.Assertions;
import org.example.NumberFour;
import org.junit.jupiter.api.Test;

public class NumberFourTest {
    @Test
    void should_multiply_three_doubles() {
        NumberFour numberFour = new NumberFour(5, 4, 8);
        Assertions.assertThat((double) (5 * 4 * 8)).isEqualTo(numberFour.multiply());
    }
}
