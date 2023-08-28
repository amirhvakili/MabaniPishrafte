package practice;

import org.assertj.core.api.Assertions;
import org.example.oneToTen.NumberTwo;
import org.junit.jupiter.api.Test;

public class NumberTwoTest {
    @Test
    void should_divide_two_numbers() {
        NumberTwo numbertwo = new NumberTwo(8, 5);

        Assertions.assertThat((double) 8 / (double) 5).isEqualTo(numbertwo.getA() / numbertwo.getB());
    }
}
