package practice.oneToTenTests;

import org.assertj.core.api.Assertions;
import org.example.oneToTen.NumberThree;
import org.junit.jupiter.api.Test;

public class NumberThreeTest {
    @Test
    void should_print_in_reverse() {
        NumberThree numberThree = new NumberThree(5, 3);
        Assertions.assertThat("3 5").isEqualTo(numberThree.return_reversed());
    }
}
