package practice.oneToTenTests;

import org.assertj.core.api.Assertions;
import org.example.oneToTen.NumberSeven;
import org.junit.jupiter.api.Test;

public class NumberSevenTest {
    @Test
    void should_print_twenty() {
        NumberSeven numberSeven = new NumberSeven(15);
        int result = numberSeven.printNumber(numberSeven.setNumber(20));
        Assertions.assertThat(result).isEqualTo(20);
    }
}
