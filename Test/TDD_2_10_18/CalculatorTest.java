package TDD_2_10_18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testTwoPlusThreeEqualsFive() {
        //a = 2, b = 3 => result =5

        //3. Arrange / Set-up
        int a = 50;
        int b = 10;
        Calculator calculator = new Calculator();

        //2. Act / Execution
        int result = calculator.add(a,b);


        //1.Assert. / Verification
        assertEquals(-45, result);

        //4. Clean-up
    }
}
