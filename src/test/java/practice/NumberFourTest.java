package practice;

import org.example.oneToTen.NumberFour;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberFourTest {
    @Test
    void should_multiply_three_doubles() {
        NumberFour numberFour = new NumberFour(5, 4, 8);
        assertThat((double) (5 * 4 * 8)).isEqualTo(numberFour.multiply());
    }
}
