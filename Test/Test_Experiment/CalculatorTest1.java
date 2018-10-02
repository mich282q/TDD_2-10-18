package Test_Experiment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {
    @Test
    void testTwoPlusThreeEqualsFive() {
        //a = 2, b = 3 => result =5

        //3. Arrange / Set-up
        int a = 2;
        int b = 3;
        Calculator1 calculator = new Calculator1();

        //2. Act / Execution
        int result = calculator.add(a,b);


        //1.Assert. / Verification
     assertEquals(5, result);

        //4. Clean-up
    }
    @Test
    void testTwoPlusThreeEqualsNine() {
        //a = 4, b = 5 => result =9

        //3. Arrange / Set-up
        int a = 4;
        int b = 5;
        Calculator1 calculator = new Calculator1();

        //2. Act / Execution
        int result = calculator.add(a,b);


        //1.Assert. / Verification
        assertEquals(9, result);

        //4. Clean-up
    }
    @Test
    void test5Minus3Equals2(){
        //Arrange
        Calculator1 calculator = new Calculator1();
        int a = 5;
        int b = 3;
        //Act
        int result = calculator.subtract(a,b);
        //Assert
        assertEquals(2, result);
    }
    @Test
    void test3Minus2Equals1(){
        //Arrange
        Calculator1 calculator = new Calculator1();
        int a = 3;
        int b = 2;
        //Act
        int result = calculator.subtract(a,b);
        //Assert
        assertEquals(1, result);
}}