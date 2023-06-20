import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator myString;

    // Tests to make sure that Runtime Exception is thrown when a negative number is added
    @Test
    public void addNegativeNumberTest1() {
        Assertions.assertThrows(RuntimeException.class, () -> StringCalculator.add("-1,5"));
    }

    @Test
    public void addNegativeNumberTest2() {
        Assertions.assertThrows(RuntimeException.class, () -> StringCalculator.add("-100,5"));
    }

    // Tests to make sure large numbers greater than 1000 are ignored
    @Test
    public void addLargeNumberTest1() {
        int result = StringCalculator.add("1,1000");
        int expected = 1;
        assertEquals(expected,result);
    }

    @Test
    public void addLargeNumberTest2() {
        int result = StringCalculator.add("304004,100200");
        int expected = 0;
        assertEquals(expected,result);
    }
}