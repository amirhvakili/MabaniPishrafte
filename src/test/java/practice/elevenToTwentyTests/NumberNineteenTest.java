package practice.elevenToTwentyTests;

import org.example.elevenToTwenty.NumberNineteen;
import org.junit.jupiter.api.Test;

public class NumberNineteenTest {
    @Test
    void change_values() {
        NumberNineteen numberNineteen = new NumberNineteen(5673.74);
        numberNineteen.printInt();
    }
}
