package practice.oneToTenTests;

import org.example.oneToTen.NumberOne;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOneTest {
    @Test
    void should_sum_two_numbers() {
        NumberOne numberOne = new NumberOne(5, 8);
        int result = numberOne.addNumbers();
        Assertions.assertThat(13).isEqualTo(result);
    }
}
