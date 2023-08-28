package practice.oneToTenTests;

import org.assertj.core.api.Assertions;
import org.example.oneToTen.NumberSix;
import org.junit.jupiter.api.Test;

public class NumberSixTest {
    @Test
    void print_number_15() {
        NumberSix numberSix = new NumberSix(15);
        int result = numberSix.printNumber();
        Assertions.assertThat(result).isEqualTo(15);
    }
}
