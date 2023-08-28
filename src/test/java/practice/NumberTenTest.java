package practice;

import org.assertj.core.api.Assertions;
import org.example.NumberTen;
import org.junit.jupiter.api.Test;

public class NumberTenTest {
    @Test
    void should_print_sum() {
        NumberTen numberTen = new NumberTen(5 , 4, 8);
        int result = numberTen.sum();
        Assertions.assertThat(result).isEqualTo(17);
        System.out.println("New from here.");
    }
}
